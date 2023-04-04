/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myutils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class myUtilsTest {

    public myUtilsTest() {
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
     * Test of inverteix method, of class myUtils.
     */
    @Test
    public void testInvertix() {
        System.out.println("invertir");
        String cadena = "Christofer";
        String expResult = "refotsirhC";
        String resultado = myUtils.invertir(cadena);
        assertEquals(expResult, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of edat method, of class myUtils.
     */
    @Test
    public void testEdad() {
        System.out.println("edad");
        int dia = 03;
        int mes = 04;
        int anyo = 1997;
        int expResultado = -2;
        int resultado = myUtils.edad(dia, mes, anyo);
        assertEquals(expResultado, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of factorial method, of class myUtils.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        double numero1 = 5;
        double expResultado = 120;
        double resultado = myUtils.factorial(numero1);
        assertEquals(expResultado, resultado, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
