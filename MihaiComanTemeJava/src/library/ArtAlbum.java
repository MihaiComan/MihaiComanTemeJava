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
public class ArtAlbum extends Book{
    
    public enum PaperQuality {BEST, GOOD, POOR};
    
       
        private String title;
        private int numberOfPages;
        private PaperQuality paperQuality;

   
    
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
}
