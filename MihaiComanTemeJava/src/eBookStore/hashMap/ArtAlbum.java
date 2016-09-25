/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class ArtAlbum extends Book{

   
    
    public enum PaperQuality {BEST, GOOD, POOR};
    
    private String title;
    private int numberOfPages;
    private PaperQuality paperQuality;
    File file = new File("bookstore.txt");//creates a new file in the project directory
    private Book next;
    Scanner bookToSearch = new Scanner(System.in);

    @Override
    public Book getNext() {
        return next;
    }

    @Override
    public void setNext(Book next) {
        this.next = next;
    }
    
    

    @Override
    public String getTitle() {
        return title; 
    }

    @Override
    public int getNumberOfPages() {
        return numberOfPages;
    }

    public PaperQuality getPaperQuality() {
        return paperQuality;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPaperQuality(PaperQuality paperQuality) {
        this.paperQuality = paperQuality;
    }

    // constructor creates a new ArtAlbum
    
    public ArtAlbum(String title, int numberOfPages, PaperQuality paperQuality) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.paperQuality = paperQuality;
    }
       
    // method to display the albums on the console
   

    @Override
    public void displayBooks(){
    
        System.out.println(getTitle() + " " + getNumberOfPages() + " pag " + getPaperQuality());
        
    }  
    
    // method to save the albums in a file
   
    @Override
   public void saveBooks(){
    
        String row = getTitle()+" "+getNumberOfPages() + " pag " + getPaperQuality();
          
            try (BufferedWriter out = new BufferedWriter(new FileWriter(file,true))) {
                
                out.write(row);
                out.newLine();
            }
      
        catch 
            (IOException e) { 
             throw new RuntimeException(e); 
        } 
    
   }
   
   
   @Override
   public String toString(){
       return "\n Title: " +  title + "\n Number of pages :" + numberOfPages + "\n Paper quality: " + paperQuality ;
   }
}
  

   
 
 