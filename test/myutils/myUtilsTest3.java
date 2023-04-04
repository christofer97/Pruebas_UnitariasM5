package myutils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class myUtilsTest3 {

    public myUtilsTest3() {
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
        String cadena = "Nicole";
        String expResult = "elociN";
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
        int dia = 32;
        int mes = 70;
        int anyo = 2050;
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
    public void testFactorial3() {
        //Test 3
        double numero3 = -15;
        double expResultado3 = -1;
        double resultado3 = myUtils.factorial(numero3);
        assertEquals(expResultado3, resultado3, 0.0);
    }

}
