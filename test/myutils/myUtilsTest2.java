package myutils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class myUtilsTest2 {

    public myUtilsTest2() {
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
        String cadena = "Almendra";
        String expResult = "ardnemlA";
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
        int dia = 15;
        int mes = 50;
        int anyo = 1742;
        int expResultado = -1;
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
        double numero2 = 6;
        double expResultado2 = 720;
        double resultado2 = myUtils.factorial(numero2);
        assertEquals(expResultado2, resultado2, 0.0);
    }

}
