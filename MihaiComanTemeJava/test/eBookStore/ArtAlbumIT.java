/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eBookStore;

import static eBookStore.ArtAlbum.PaperQuality.GOOD;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mihai
 */
public class ArtAlbumIT {
    
    public ArtAlbumIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTitle method, of class ArtAlbum.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        ArtAlbum instance = new ArtAlbum("Sonoro.Imagining Music", 178, GOOD);
        String expResult = "Sonoro.Imagining Music";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getNumberOfPages method, of class ArtAlbum.
     */
    @Test
    public void testGetNumberOfPages() {
        System.out.println("getNumberOfPages");
        ArtAlbum instance = new ArtAlbum("Sonoro.Imagining Music", 178, GOOD);
        int expResult = 178;
        int result = instance.getNumberOfPages();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPaperQuality method, of class ArtAlbum.
     */
    @Test
    public void testGetPaperQuality() {
        System.out.println("getPaperQuality");
        ArtAlbum instance = new ArtAlbum("Sonoro.Imagining Music", 178, GOOD);
        ArtAlbum.PaperQuality expResult = GOOD;
        ArtAlbum.PaperQuality result = instance.getPaperQuality();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTitle method, of class ArtAlbum.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        ArtAlbum instance = new ArtAlbum("Sonoro.Imagining Music", 178, GOOD);
        instance.setTitle(title);
        
    }

    /**
     * Test of setNumberOfPages method, of class ArtAlbum.
     */
    @Test
    public void testSetNumberOfPages() {
        System.out.println("setNumberOfPages");
        int numberOfPages = 0;
        ArtAlbum instance = new ArtAlbum("Sonoro.Imagining Music", 178, GOOD);
        instance.setNumberOfPages(numberOfPages);
        
    }

    /**
     * Test of setPaperQuality method, of class ArtAlbum.
     */
    @Test
    public void testSetPaperQuality() {
        System.out.println("setPaperQuality");
        ArtAlbum.PaperQuality paperQuality = null;
        ArtAlbum instance = new ArtAlbum("Sonoro.Imagining Music", 178, GOOD);
        instance.setPaperQuality(paperQuality);
        
    }

    /**
     * Test of displayBooks method, of class ArtAlbum.
     */
    @Test
    public void testDisplayBooks() {
        System.out.println("displayBooks");
        ArtAlbum instance = new ArtAlbum("Sonoro.Imagining Music", 178, GOOD);
        instance.displayBooks();
      
    }

    /**
     * Test of saveBooks method, of class ArtAlbum.
     */
    @Test
    public void testSaveBooks() {
        System.out.println("saveBooks");
        ArtAlbum instance = new ArtAlbum("Sonoro.Imagining Music", 178, GOOD);
        instance.saveBooks();
        
    }

    /**
     * Test of getNext method, of class ArtAlbum.
     */
    @Test
    public void testGetNext() {
        System.out.println("getNext");
        ArtAlbum instance = null;
        Book expResult = null;
        Book result = instance.getNext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNext method, of class ArtAlbum.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        Book next = null;
        ArtAlbum instance = null;
        instance.setNext(next);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
