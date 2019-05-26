/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasolina;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author ALEJANDRO
 */
public class FuelTankIT {
    
    public FuelTankIT() {
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
     * Test of getTankLevel method, of class FuelTank.
     */
    @Test
    public void testGetTankLevel() {
        System.out.println("getTankLevel");
        FuelTank fuel=new FuelTank(40.0,0.0);
        double expResult = 10.0;
        double result = fuel.getTankLevel();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTankMax method, of class FuelTank.
     */
    @Test
    public void testGetTankMax() {
        System.out.println("getTankMax");
        FuelTank fuel=new FuelTank(40.0,0.0);
        double expResult = 40.0;
        double result = fuel.getTankMax();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of halfFullTank method, of class FuelTank.
     */
    @Test
    public void testHalfFullTank() {
        System.out.println("halfFullTank");
        FuelTank fuel=new FuelTank(40.0,0.0);
        double expResult = 20.0;
        double result = fuel.halfFullTank();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class FuelTank.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        FuelTank fuel=new FuelTank(40.0,0.0);
        boolean expResult = false;
        boolean result = fuel.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isFull method, of class FuelTank.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        FuelTank fuel=new FuelTank(40.0,0.0);
        boolean expResult = false;
        boolean result = fuel.isFull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of fill method, of class FuelTank.
     */
    @Test
    public void testFill() {
        System.out.println("fill");
        double amount = 15;
        double expResult=25;
        FuelTank fuel=new FuelTank(40.0,0.0);
        double tankLevel=fuel.fill(amount);
        assertEquals(expResult,tankLevel,0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
   
    
    
 
  
    
    /**
     * Test of consume method, of class FuelTank.
     */
    @Test
    public void testConsume() {
        System.out.println("consume");
        double amount = 0.0;
        FuelTank fuel=new FuelTank(40.0,10.0);
        fuel.consume(amount);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
