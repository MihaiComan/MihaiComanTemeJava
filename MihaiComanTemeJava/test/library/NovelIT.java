/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import static library.Novel.Genre.SF;
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
public class NovelIT {
    
    public NovelIT() {
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
     * Test of getTitle method, of class Novel.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Novel instance = new Novel("The Foundation",500,SF);
        String expResult = "The Foundation";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getNumberOfPages method, of class Novel.
     */
    @Test
    public void testGetNumberOfPages() {
        System.out.println("getNumberOfPages");
        Novel instance = new Novel("The Foundation",500,SF);
        int expResult = 500;
        int result = instance.getNumberOfPages();
        assertEquals(expResult, result);
       }

    /**
     * Test of getGenre method, of class Novel.
     */
    @Test
    public void testGetGenre() {
        System.out.println("getGenre");
        Novel instance = new Novel("The Foundation",500,SF);
        Novel.Genre expResult = SF;
        Novel.Genre result = instance.getGenre();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTitle method, of class Novel.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Novel instance = new Novel("The Foundation",500,SF);
        instance.setTitle(title);
        
    }

    /**
     * Test of setNumberOfPages method, of class Novel.
     */
    @Test
    public void testSetNumberOfPages() {
        System.out.println("setNumberOfPages");
        int numberOfPages = 0;
        Novel instance = new Novel("The Foundation",500,SF);
        instance.setNumberOfPages(numberOfPages);
       
    }

    /**
     * Test of setGenre method, of class Novel.
     */
    @Test
    public void testSetGenre() {
        System.out.println("setGenre");
        Novel.Genre genre = null;
        Novel instance = new Novel("The Foundation",500,SF);
        instance.setGenre(genre);
        
    }

    /**
     * Test of displayBooks method, of class Novel.
     */
    @Test
    public void testDisplayBooks() {
        System.out.println("displayBooks");
        Novel instance = new Novel("The Foundation",500,SF);
        instance.displayBooks();
       
    }
    
}
