/*
 * Short app to implement CRUD operations with input from keyboard and output in console.
 */
package javaDBDemo;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mihai
 */
public class JavaDBDemoApp {

    
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        
        int y = 0;
        int user_choice = 1;
        boolean quit = false;

        do {
            //display menu to user
            //ask user for his choice and validate it (make sure it is between 1 and 6)
            System.out.println();
            System.out.println("1) Add a book to the database");
            System.out.println("2) Delete a book from the database");
            System.out.println("3) List the titles of all the books in the database");
            System.out.println("4) Add a rating to a book from the data base");
            System.out.println("5) List all the information about the books in the database");
            System.out.println("6) Quit");
            System.out.println();
            System.out.print("Enter choice [1-6]: ");
            user_choice = s.nextInt();
            
            switch (user_choice) {
                
                case 1: System.out.println("Enter the book ISBN:");
                        String isbn = s.next();
                        System.out.println("Enter the book name:");
                        String name = s.next();
                        System.out.println("Enter the book type:");
                        String type = s.next();
                        System.out.println("Enter the book paper quality:");
                        String pq = s.next();
                        System.out.println("Enter the book genre:");
                        String gen = s.next();
                        System.out.println("Enter the book number of pages:");
                        int pag = s.nextInt();
                        
            
                try {
                    LibraryDemo_PreparedStatement.insertBooks(isbn, name, type, pq, gen, pag);
                } catch (SQLException ex) {
                    Logger.getLogger(JavaDBDemoApp.class.getName()).log(Level.SEVERE, null, ex);
                }
            
                break;
                case 2: System.out.println("Please enter the ISBN of the book you want to delete");
                        String isbnd = s.next();
                        
                  try {
                    LibraryDemo_PreparedStatement.deleteBooks(isbnd);
                } catch (SQLException ex) {
                    Logger.getLogger(JavaDBDemoApp.class.getName()).log(Level.SEVERE, null, ex);
                }
                  break;
                  
                case 3: System.out.println("These are the books registered in the database ");
                
                        try {
                        LibraryDemo_PreparedStatement.displayBooks();
                        } catch (SQLException ex) {
                            Logger.getLogger(JavaDBDemoApp.class.getName()).log(Level.SEVERE, null, ex);
                        }
                  break;
                  
                case 4: System.out.println("Please enter the operation ID");
                        int id = s.nextInt();
                        System.out.println("Please enter your rating");
                        String rat = s.next();
                        System.out.println("Please enter your SSN");
                        String ssnu = s.next();
                        System.out.println("Please enter the ISBN of the book you rated");
                        String isbnr = s.next();
                  try {
                        LibraryDemo_PreparedStatement.addRating(id,rat,ssnu,isbnr);
                        } catch (SQLException ex) {
                            Logger.getLogger(JavaDBDemoApp.class.getName()).log(Level.SEVERE, null, ex);
                        }
                  break;
                  
                case 5: System.out.println("These are all the informations from the database!");
                    try {
                        LibraryDemo_PreparedStatement.displayRecords();
                        } catch (SQLException ex) {
                            Logger.getLogger(JavaDBDemoApp.class.getName()).log(Level.SEVERE, null, ex);
                        }
                  break;
                  
                case 6: System.out.println("Thanks for coming");
                    quit = true;
                    break;
                default: System.out.println("\nInvalid Choice");
            }
        
    } while(!quit);
    
    }
}