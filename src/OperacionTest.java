import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class OperacionTest {
    
    String operacion;
    Operacion oper;

    @Before
    public void inicializarOperacion() {
        operacion = "";
        oper = new Operacion();
    }

    @Test
    public void testOperacionSuma() {
        assertTrue(oper.devolverOperacion("+").equals("suma"));
    }

    @Test
    public void testOperacionResta() {
        assertEquals("resta", oper.devolverOperacion("-"));
    }

    @Test
    public void testOperacionMultiplicacion() {
        assertFalse(oper.devolverOperacion("*").equals("division"));
        assertTrue(oper.devolverOperacion("*").equals("multiplicacion"));
    }

    @Test
    public void testOperacionDivision() {
        assertEquals("division", oper.devolverOperacion("/"));
    }
}
