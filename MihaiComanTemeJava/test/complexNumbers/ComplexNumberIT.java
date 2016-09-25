/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexNumbers;

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
public class ComplexNumberIT {
    
    public ComplexNumberIT() {
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
     * Test of toString method, of class ComplexNumber.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ComplexNumber instance = new ComplexNumber(5.0, 6.0);
        String expResult = "5.0 + 6.0i";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of abs method, of class ComplexNumber.
     */
    @Test
    public void testAbs() {
        System.out.println("abs");
        ComplexNumber instance = new ComplexNumber(5.0, 6.0);
        double expResult = 7.81;
        double result = instance.abs();
        assertEquals(expResult, result, 0.01);
       
    }

    /**
     * Test of phase method, of class ComplexNumber.
     */
    @Test
    public void testPhase() {
        System.out.println("phase");
        ComplexNumber instance = new ComplexNumber(5.0, 6.0);
        double expResult = 0.87;
        double result = instance.phase();
        assertEquals(expResult, result, 0.01);
        
    }

    /**
     * Test of plus method, of class ComplexNumber.
     */
    @Test
    public void testPlus() {
        System.out.println("plus");
        ComplexNumber that = new ComplexNumber(0.0, 6.0);
        ComplexNumber instance = new ComplexNumber(5.0, 6.0);
        ComplexNumber expResult = new ComplexNumber(5.0, 12.0);
        ComplexNumber result = instance.plus(that);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of minus method, of class ComplexNumber.
     */
    @Test
    public void testMinus() {
        System.out.println("minus");
        ComplexNumber that = new ComplexNumber(0.0, 6.0);
        ComplexNumber instance = new ComplexNumber(5.0, 6.0);
        ComplexNumber expResult = new ComplexNumber(5.0, 0.0);
        ComplexNumber result = instance.minus(that);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of times method, of class ComplexNumber.
     */
    @Test
    public void testTimes_ComplexNumber() {
        System.out.println("times");
        ComplexNumber that = new ComplexNumber(0.0, 6.0);
        ComplexNumber instance = new ComplexNumber(5.0, 6.0);
        ComplexNumber expResult = new ComplexNumber(-36.0, 30.0);
        ComplexNumber result = instance.times(that);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of scale method, of class ComplexNumber.
     */
    @Test
    public void testScale() {
        System.out.println("scale");
        double alpha = 0.0;
        ComplexNumber instance = new ComplexNumber(5.0, 6.0);
        ComplexNumber expResult = new ComplexNumber(0.0, 0.0);
        ComplexNumber result = instance.scale(alpha);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of times method, of class ComplexNumber.
     */
    @Test
    public void testTimes_double() {
        System.out.println("times");
        double alpha = 0.0;
        ComplexNumber instance = new ComplexNumber(5.0, 6.0);
        ComplexNumber expResult = new ComplexNumber(0.0, 0.0);
        ComplexNumber result = instance.times(alpha);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of conjugate method, of class ComplexNumber.
     */
    @Test
    public void testConjugate() {
        System.out.println("conjugate");
        ComplexNumber instance = new ComplexNumber(5.0, 6.0);
        ComplexNumber expResult = new ComplexNumber(5.0, -6.0);
        ComplexNumber result = instance.conjugate();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of reciprocal method, of class ComplexNumber.
     */
    @Test
    public void testReciprocal() {
        System.out.println("reciprocal");
        ComplexNumber instance = new ComplexNumber(5.0, 6.0);
        ComplexNumber expResult = new ComplexNumber(0.08196721311475409, - 0.09836065573770492);
        ComplexNumber result = instance.reciprocal();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of re method, of class ComplexNumber.
     */
    @Test
    public void testRe() {
        System.out.println("re");
        ComplexNumber instance = new ComplexNumber(5.0, 6.0);
        double expResult = 5.0;
        double result = instance.re();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of im method, of class ComplexNumber.
     */
    @Test
    public void testIm() {
        System.out.println("im");
        ComplexNumber instance = new ComplexNumber(5.0, 6.0);
        double expResult = 6.0;
        double result = instance.im();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of divides method, of class ComplexNumber.
     */
    @Test
    public void testDivides() {
        System.out.println("divides");
        ComplexNumber that = new ComplexNumber(0.0, 6.0);
        ComplexNumber instance = new ComplexNumber(5.0, 6.0);
        ComplexNumber expResult = new ComplexNumber(1.0, - 0.8333333333333333);
        ComplexNumber result = instance.divides(that);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of exp method, of class ComplexNumber.
     */
    @Test
    public void testExp() {
        System.out.println("exp");
        ComplexNumber instance = new ComplexNumber(5.0, 6.0);
        ComplexNumber expResult = new ComplexNumber(142.50190551820737, - 41.468936789922886);
        ComplexNumber result = instance.exp();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of sin method, of class ComplexNumber.
     */
    @Test
    public void testSin() {
        System.out.println("sin");
        ComplexNumber instance = new ComplexNumber(5.0, 6.0);
        ComplexNumber expResult = new ComplexNumber(-193.43002005693958, 57.21839505634109);
        ComplexNumber result = instance.sin();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of cos method, of class ComplexNumber.
     */
    @Test
    public void testCos() {
        System.out.println("cos");
        ComplexNumber instance = new ComplexNumber(5.0, 6.0);
        ComplexNumber expResult = new ComplexNumber(57.21909818460074, 193.4276431213065);
        ComplexNumber result = instance.cos();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of tan method, of class ComplexNumber.
     */
    @Test
    public void testTan() {
        System.out.println("tan");
        ComplexNumber instance = new ComplexNumber(5.0, 6.0);
        ComplexNumber expResult = new ComplexNumber(-6.685231390246571E-6, 1.0000103108981198);
        ComplexNumber result = instance.tan();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of equals method, of class ComplexNumber.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object x = null;
        ComplexNumber instance = new ComplexNumber(5.0, 6.0);
        boolean expResult = false;
        boolean result = instance.equals(x);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of hashCode method, of class ComplexNumber.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        ComplexNumber instance = new ComplexNumber(5.0, 6.0);
        int expResult = 89413549;
        int result = instance.hashCode();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of main method, of class ComplexNumber.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ComplexNumber.main(args);
        
    }
    
}
