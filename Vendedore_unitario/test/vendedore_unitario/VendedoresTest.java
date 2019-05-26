/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendedore_unitario;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rootadmin
 */
public class VendedoresTest {
    
    public VendedoresTest() {
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
     * Test of agregar method, of class Vendedores.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Vendedor ven = null;
        Vendedor vender=new Vendedor(1,"alex","mercado","alicante","elche","calle 123");
        Vendedores instance = new Vendedores();
        boolean expResult = true;
        boolean result = instance.agregar(vender);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar_Vendedor method, of class Vendedores.
     */
    @Test
    public void testEliminar_Vendedor() {
        System.out.println("Eliminar_Vendedor");
        int numvend = 0;
        Vendedores instance = new Vendedores();
        boolean expResult = false;
        boolean result = instance.Eliminar_Vendedor(numvend);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of buscar_vendedor method, of class Vendedores.
     */
    @Test
    public void testBuscar_vendedor_int() {
        System.out.println("buscar_vendedor");
        int numvend = 0;
        Vendedores instance = new Vendedores();
        Vendedor expResult = null;
        Vendedor result = instance.buscar_vendedor(numvend);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of buscar_vendedor method, of class Vendedores.
     */
    @Test
    public void testBuscar_vendedor_String() {
        System.out.println("buscar_vendedor");
        String provincia = "";
        Vendedores instance = new Vendedores();
        Vendedor expResult = null;
        //Vendedor result = instance.buscar_vendedor(provincia);
      //  assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    
}
