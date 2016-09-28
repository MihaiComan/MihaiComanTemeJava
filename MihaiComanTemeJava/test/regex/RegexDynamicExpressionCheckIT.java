/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

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
public class RegexDynamicExpressionCheckIT {
    
    public RegexDynamicExpressionCheckIT() {
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

    
    @Rule
    public final TextFromStandardInputStream systemInMock 
             = emptyStandardInputStream();
    
    
    /**
     * Test of main method, of class RegexDynamicExpressionCheck.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        systemInMock.provideText("1810130297287");
        String expResult = null;
        Object result = null;
        assertEquals(expResult, result);
        String[] args = null;
        RegexDynamicExpressionCheck.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
