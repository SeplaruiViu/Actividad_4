import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class CalculadoraTest {
    
    private int a;
    private int b;


    @Before
    public void inicializacion() {
        a = 34;
        b = 23;
    }

    @Test
    public void testSuma() {
        assertEquals(57, Calculadora.suma(a, b));
        assertTrue(Calculadora.suma(a, b)>=50);
    }

    @Test
    public void testResta() {
        assertEquals(-11, Calculadora.resta(b, a));
        assertFalse(Calculadora.resta(b,a) > 0);
    }

    @Test
    public void testMultiplicacion() {
        assertEquals(782, Calculadora.multiplicacion(a, b));
        assertTrue(Calculadora.multiplicacion(a, b) == Calculadora.multiplicacion(b, a));
    }

    @Test
    public void testDivision() {
        assertEquals(1, Calculadora.division(a,b), 0.00001);
        assertEquals(0, Calculadora.division(b,a), 0.00001);
    }





}
