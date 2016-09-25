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
import org.junit.Rule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

/**
 *
 * @author Mihai
 */
public class BookStoreIT {
    
    public BookStoreIT() {
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
     * Test of main method, of class BookStore.
     */
    
    @Rule
    public final TextFromStandardInputStream systemInMock 
             = emptyStandardInputStream();
    
    @Test
    public void testMain() {
        System.out.println("main");
        systemInMock.provideText("Inferno");
        String expResult = null;
        Object result = null;
        assertEquals(expResult, result);
        String[] args = null;
        BookStore.main(args);
        
    }
    
}
