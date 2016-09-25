/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersmagic;

import java.util.Calendar;
import java.text.*;

/**
 *
 * @author Mihai
 */
public class NumbersMagic {

    /**
     * @param pattern
     * @param value
     */
   static public void customFormat(String pattern, double value ) {
      
       DecimalFormat myFormatter = new DecimalFormat(pattern);
      
       String output = myFormatter.format(value);
      
       System.out.println(value + "  " + pattern + "  " + output);
   }
          
    public static void main(String[] args) {
        // TODO code application logic here
                
        System.out.println("Absolute value of -191.635 is : " + Math.abs(-191.635));
                       
        System.out.println("Ceil of 43.74 is : " + Math.ceil(43.74));
        
        System.out.println("Floor of 43.74 is : " + Math.floor(43.74));
        
        System.out.println("Rint of 43.74 is : " + Math.rint(43.74));
        
        System.out.println("Maximum of 16 and 45 is : " + Math.max(16,45));
        
        System.out.println("Minimum of 16 and 45 is : " + Math.min(16,45));
        
        System.out.println("The value of e is : " + Math.E);
        
        System.out.println("Exponent of 11.635 is : " + Math.exp(11.635));
        
        System.out.println("Logarithm of 11.635 is : " + Math.log(11.635));
        
        System.out.println("11.635 at power 2.76 is : " + Math.pow(11.635 , 2.76));
        
        System.out.println("Square root of 11.635 is : " + Math.sqrt(11.635));
        
        
        long a = 461012 ;
    
        System.out.format("%d%n" , a) ;
        
        System.out.format("%08d%n" , a) ;
        
        System.out.format("%+8d%n" , a) ;
        
        System.out.format("%,8d%n" , a) ;
        
        System.out.format("%+,8d%n" , a) ;
        
        
        Calendar c = Calendar.getInstance();
        
        System.out.format("%tB %te , %tY%n" , c , c , c) ;
        
        System.out.format("%tl:%tM %tp %n" , c , c , c) ;
        
        System.out.format("%tD,%n" , c) ;
        
        
        double pi = Math.PI ;
        
        System.out.format("%f%n", pi) ;
        
        System.out.format("%.3f%n", pi) ;
        
        System.out.format("%10.3f%n", pi) ;
        
        System.out.format("%-10.3f%n", pi) ;
        
        
        
        customFormat("###,###.###", 123456.789);
        
        customFormat("###.##", 123456.789);
        
        customFormat("000000.000", 123.78);
        
        customFormat("$###,###.###", 12345.67);
        
        }
    
}
