/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eBookStore.hashMap;

import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mihai
 */
public class Evaluation {
    
     private float stars;
     private int user_ID;
     private String description;
     public Evaluation(float stars, int user_ID, String description) {
        
         try {
             this.stars = validateStars(stars);
             this.user_ID = user_ID;
             this.description = validateDescription(description);
         } catch (ValidationException ex) {
             Logger.getLogger(Evaluation.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(Evaluation.class.getName()).log(Level.SEVERE, null, ex);
         }
      
    }
     

    /**
     * Get the value of description
     *
     * @return the value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the value of description
     *
     * @param description new value of description
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Get the value of user_ID
     *
     * @return the value of user_ID
     */
    public int getUser_ID() {
        return user_ID;
    }

    /**
     * Set the value of user_ID
     *
     * @param user_ID new value of user_ID
     */
    public void setUser_ID(int user_ID) {
        this.user_ID = user_ID;
    }


    /**
     * Get the value of stars
     *
     * @return the value of stars
     */
    public float getStars() {
        return stars;
    }

    /**
     * Set the value of stars
     *
     * @param stars new value of stars
     */
    public void setStars(float stars) {
        this.stars = stars;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Float.floatToIntBits(this.stars);
        hash = 79 * hash + this.user_ID;
        hash = 79 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Evaluation other = (Evaluation) obj;
        if (Float.floatToIntBits(this.stars) != Float.floatToIntBits(other.stars)) {
            return false;
        }
        if (this.user_ID != other.user_ID) {
            return false;
        } else{
            
        }
        return Objects.equals(this.description, other.description);
    }
 
    
   @Override
   public String toString(){
       return "\n Rating: " +  stars + " stars" + "\n UserID :" + user_ID + "\n Description: " + description ;
   }
   
   
   // method to round the stars number to 0.5
   
    public static float roundToHalf(float d) {
        return (float) (Math.round(d * 2) / 2.0);
    }
    
    // method to validate the stars number
    
     static float validateStars(float stars) throws ValidationException { 
    
        float value = stars;
      
        if (value < 1 || value > 5){ 
      
        throw new ValidationException("should be between 1 and 5 inclusive");
        
        }
        else {
            if (value != roundToHalf((float) (value))){
                throw new ValidationException("should be rounded to 0.5");
            }
  
        }
    return value; 
    } 
    
      //method to validate the description
    
   static String validateDescription(String description) throws IOException { 
       
      
       if (description.length()>255) { 
      
         throw new IOException("The description should be max 255 characters long"); 
      } 
      return description; 
   }
    
   // method to validate the user_ID
   
 /*  static int validateUser_ID(int user_ID) throws ValidationException { 
        int value=user_ID; 
         
        if (value = this.user_ID) { 
             throw new ValidationException("should be unique for the same book"); 
        } 
        return value;  
    }*/
     
}
   
