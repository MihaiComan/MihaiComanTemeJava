/*
 * MIhai Coman
 */
package library;
import java.util.LinkedList;
import static library.ArtAlbum.PaperQuality.BEST;
import static library.ArtAlbum.PaperQuality.GOOD;
import static library.Novel.Genre.ADVENTURES;
import static library.Novel.Genre.CRIME;
import static library.Novel.Genre.ROMANCE;
import static library.Novel.Genre.SF;
/**
 *
 * @author Mihai
 */
public class LibrayCatalog {

    
    public static void main(String[] args) {
     
        // create a list of different books
                    
        LinkedList <Book>listOfBooks = new LinkedList<>();
        listOfBooks.add(new Novel("The Foundation",500,SF));
        listOfBooks.add(new ArtAlbum("Sonoro.Imagining Music", 178, GOOD));
        listOfBooks.add(new Novel("The Lord of the Rings", 1000, ADVENTURES));
        listOfBooks.add(new Novel("The Lost Bible",1500,CRIME));
        listOfBooks.add(new ArtAlbum("Bucharest Monuments",145,BEST));
        
        // add a new book
        
        listOfBooks.add(new Novel("Gone with the Wind",400,ROMANCE));
        
        // delete the book from a given position in the list
        
        listOfBooks.remove(3);
        
        // print books on console 
       
        short book = 0; 
        try{ 
            while(listOfBooks.get(book) != null){ 
                
                Book currentBook; 
                currentBook = (Book)listOfBooks.get(book);
                currentBook.displayBooks();   
            
                book++; 
            } 
        } 
        catch(IndexOutOfBoundsException e){ 
            
                System.out.println("The List of Books is ended."); 
        
    }
        finally{
                }
            }
}