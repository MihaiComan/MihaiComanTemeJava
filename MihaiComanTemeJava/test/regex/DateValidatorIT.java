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

/**
 *
 * @author Mihai
 */
public class DateValidatorIT {
    
    public DateValidatorIT() {
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
     * Test of isThisDateValid method, of class DateValidator.
     */
    @Test
    public void testIsThisDateValid() {
        System.out.println("isThisDateValid");
        String dateToValidate = "810130";
        String dateFromat = "yyMMdd";
        boolean expResult = true;
        boolean result = DateValidator.isThisDateValid(dateToValidate, dateFromat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
