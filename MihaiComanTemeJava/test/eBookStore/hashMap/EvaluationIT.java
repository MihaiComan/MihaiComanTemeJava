/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eBookStore.hashMap;

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
public class EvaluationIT {
    
    public EvaluationIT() {
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
     * Test of getDescription method, of class Evaluation.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Evaluation instance =  new Evaluation(3,111,"Vacations at last? Time to discover the most beautiful "
                + "\n and unusual travel destinations in the world.");
        String expResult = "Vacations at last? Time to discover the most beautiful "
                + "\n and unusual travel destinations in the world.";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Evaluation.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Evaluation instance = new Evaluation(3,111,"Vacations at last? Time to discover the most beautiful "
                + "\n and unusual travel destinations in the world.");
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUser_ID method, of class Evaluation.
     */
    @Test
    public void testGetUser_ID() {
        System.out.println("getUser_ID");
        Evaluation instance = new Evaluation(3,111,"Vacations at last? Time to discover the most beautiful "
                + "\n and unusual travel destinations in the world.");
        int expResult = 111;
        int result = instance.getUser_ID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setUser_ID method, of class Evaluation.
     */
    @Test
    public void testSetUser_ID() {
        System.out.println("setUser_ID");
        int user_ID = 0;
        Evaluation instance = new Evaluation(3,111,"Vacations at last? Time to discover the most beautiful "
                + "\n and unusual travel destinations in the world.");
        instance.setUser_ID(user_ID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStars method, of class Evaluation.
     */
    @Test
    public void testGetStars() {
        System.out.println("getStars");
        Evaluation instance = new Evaluation(3,111,"Vacations at last? Time to discover the most beautiful "
                + "\n and unusual travel destinations in the world.");
        float expResult = 3.0F;
        float result = instance.getStars();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStars method, of class Evaluation.
     */
    @Test
    public void testSetStars() {
        System.out.println("setStars");
        float stars = 0.0F;
        Evaluation instance = new Evaluation(3,111,"Vacations at last? Time to discover the most beautiful "
                + "\n and unusual travel destinations in the world.");
        instance.setStars(stars);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Evaluation.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Evaluation instance = new Evaluation(3,111,"Vacations at last? Time to discover the most beautiful "
                + "\n and unusual travel destinations in the world.");
        int expResult = 1123743667;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Evaluation.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Evaluation instance = new Evaluation(3,111,"Vacations at last? Time to discover the most beautiful "
                + "\n and unusual travel destinations in the world.");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   

    /**
     * Test of roundToHalf method, of class Evaluation.
     */
    @Test
    public void testRoundToHalf() {
        System.out.println("roundToHalf");
        float d = 3.6F;
        float expResult = 3.5F;
        float result = Evaluation.roundToHalf(d);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
