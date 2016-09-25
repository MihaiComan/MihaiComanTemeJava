/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Mihai
 */
public class Novel extends Book{

   public enum Genre {SF, MYSTERY, ROMANCE, ADVENTURES, CRIME};

    private  String title;
    private  int numberOfPages;
    public  Genre genre;
    
      
    // constructor creates a new Novel

    public Novel(String title, int numberOfPages, Genre genre) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }
    
    
    
    @Override
    public String getTitle() {
        return title;
    }

   @Override
    public int getNumberOfPages() {
        return numberOfPages;
    }

    public Genre getGenre() {
        return genre;
    }
  
   @Override
    public void setTitle(String title) {
        this.title = title;
    }

   @Override
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    
    // method to display the novels on the console
    
   @Override
   public void displayBooks(){
       
       System.out.println(getTitle() + " " + getNumberOfPages() + " pag " + getGenre());
       
       
   }

   
         
 }
