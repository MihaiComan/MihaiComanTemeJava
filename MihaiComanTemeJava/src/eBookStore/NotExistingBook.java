/*
 */
package eBookStore;

/**
 *
 * @author Mihai
 */
public class NotExistingBook extends RuntimeException{
    
    NotExistingBook(String s) {
        
        super(s);
    
    }
  
}
