/*
 * 
 */
package eBookStore.hashMap;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Mihai
 */
public class Book {
    // the atributes of the Books class
    private  String title;
    private  int numberOfPages;
    File file = new File("bookstore.txt"); //creates a new file in the project directory
            

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    
    // method to display the books on the console
   
    public void displayBooks(){

       System.out.println(getTitle()+" "+getNumberOfPages());
          
    }
    // method to save books in a file 
    
    public void saveBooks(){
    
        String row = getTitle()+" "+getNumberOfPages();
               
            try 
                (BufferedWriter out = new BufferedWriter(new FileWriter(file,true))) {
                out.write(row);
                out.newLine();
            }
             catch  (IOException e) { 
             throw new RuntimeException(e); 
             } 
    
    }
    
   
    
    
}
  
        
  
 
        