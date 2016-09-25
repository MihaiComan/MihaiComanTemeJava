/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eBookStore;

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
public class BookIT {
    
    public BookIT() {
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
     * Test of getNext method, of class Book.
     */
    @Test
    public void testGetNext() {
        System.out.println("getNext");
        Book instance = new Book();
        Book expResult = null;
        Book result = instance.getNext();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNext method, of class Book.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        Book next = null;
        Book instance = new Book();
        instance.setNext(next);
       
    }

    /**
     * Test of getTitle method, of class Book.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Book instance = new Book();
        String expResult = null;
        String result = instance.getTitle();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getNumberOfPages method, of class Book.
     */
    @Test
    public void testGetNumberOfPages() {
        System.out.println("getNumberOfPages");
        Book instance = new Book();
        int expResult = 0;
        int result = instance.getNumberOfPages();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setTitle method, of class Book.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Book instance = new Book();
        instance.setTitle(title);
      
    }

    /**
     * Test of setNumberOfPages method, of class Book.
     */
    @Test
    public void testSetNumberOfPages() {
        System.out.println("setNumberOfPages");
        int numberOfPages = 0;
        Book instance = new Book();
        instance.setNumberOfPages(numberOfPages);
       
    }

    /**
     * Test of displayBooks method, of class Book.
     */
    @Test
    public void testDisplayBooks() {
        System.out.println("displayBooks");
        Book instance = new Book();
        instance.displayBooks();
      
    }

    /**
     * Test of saveBooks method, of class Book.
     */
    @Test
    public void testSaveBooks() {
        System.out.println("saveBooks");
        Book instance = new Book();
        instance.saveBooks();
      
    }
    
}
