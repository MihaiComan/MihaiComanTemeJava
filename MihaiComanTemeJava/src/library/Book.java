/*
 * 
 */
package library;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Mihai
 */
public class Book {
    // the atributes of the Books clasS  
    private  String title;
    private  int numberOfPages;
    File file = new File("bookstore.txt");
    
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
    
} 
