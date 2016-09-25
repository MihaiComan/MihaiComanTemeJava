/*
 * MIhai Coman
 */
package eBookStore;

import static eBookStore.ArtAlbum.PaperQuality.BEST;
import static eBookStore.ArtAlbum.PaperQuality.GOOD;
import static eBookStore.ArtAlbum.PaperQuality.POOR;
import static eBookStore.Novel.Genre.ADVENTURES;
import static eBookStore.Novel.Genre.CRIME;
import static eBookStore.Novel.Genre.ROMANCE;
import static eBookStore.Novel.Genre.SF;
import java.util.*;
import java.io.File;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 *
 * @author Mihai
 */
public class BookStore {
  
    // method to search for a book in the book store
    
   static void  searchBook(LinkedList listOfBooks) throws NotExistingBook{
        Scanner bookToSearch = new Scanner(System.in);
        LinkedList list = listOfBooks;
        Book current;
        
            if(list.isEmpty()){
                System.out.println("Nu exista carti in librarie");
            }
            else{
                String inputTitle;
                boolean found = false; 
                short i=0;
                System.out.print("\nGreetings, please enter the name of the book:\n");
                inputTitle = bookToSearch.nextLine();
        
                 while ((i<list.size()) && (!found)){
                     current = (Book)list.get(i);
                     if (inputTitle.equals(current.getTitle())){
                         System.out.println("The book is in the library");
                         found = true; 
                     }
                     i++;
                     }
                 if (!found){
                    throw new NotExistingBook("Required book doesn't exist in our bookstore");
                     }    
            
                 }
        }
          
    /** Define a static logger variable so that it references the
    * Logger instance named "logger"
    * All the logging messages will be sent to 
    * C:\Users\...\Documents\NetBeansProjects\\logs\mylogs.txt
    * the log4j2.properties file used to configure log4j has to be in the default package 
    */
    private static final Logger LOG = LogManager.getLogger(BookStore.class);
    
    public static void main(String[] args) {
            
        LOG.info("Start Main");
        
        // create a list of different books 
                    
        LinkedList listOfBooks = new LinkedList();
        listOfBooks.add(new Novel("The Foundation",500,SF));
        listOfBooks.add(new ArtAlbum("Sonoro.Imagining Music", 178, GOOD));
        listOfBooks.add(new Novel("The Lord of the Rings", 1000, ADVENTURES));
        listOfBooks.add(new Novel("The Lost Bible",600,CRIME));
        listOfBooks.add(new ArtAlbum("Bucharest Monuments",145,BEST));
        listOfBooks.add(new ArtAlbum("Vertigo.The iInfinite List",400,BEST));
        listOfBooks.add(new Novel("Inferno",500,CRIME));
        listOfBooks.add(new Novel("I,Robot",400,SF));
        listOfBooks.add(new Novel("The Shannara Chronicles",1500,ADVENTURES));
        listOfBooks.add(new ArtAlbum("Factory Design",338,GOOD));
        listOfBooks.add(new ArtAlbum("Executive Escapes",220,POOR));
             
        // add a new book
        
        listOfBooks.add(new Novel("Gone with the Wind",400,ROMANCE));
        LOG.info("A new book was added to the Bookstore");
        
        // delete the book from a given position in the list
                     
        listOfBooks.remove(3);
        LOG.info("A book was removed from the Bookstore");
        
        try {
            searchBook(listOfBooks);
            
        }
        
         catch (NotExistingBook m){
             LOG.error( "Error during run",m);
             System.out.println("Exception occured: "+m);}
         
        
        // print books on console and save in a file
        
        short book = 0; 
        File file = new File("bookstore.txt");//creates a new file in the project directory
        file.delete();
       
       
           try{ 
             while(listOfBooks.get(book) != null){ 
                
                Book currentBook; 
                currentBook = (Book)listOfBooks.get(book);
                currentBook.displayBooks();   
                currentBook.saveBooks();
                LOG.info("A new book was saved to the file Bookstore.txt");
                book++; 
            } 
        } 
        catch(IndexOutOfBoundsException e){ 
                LOG.error( "Error during run",e); 
                System.out.println("The List of Books is ended."); 
        }
        LOG.info("End Main");
    }
}

    
      
