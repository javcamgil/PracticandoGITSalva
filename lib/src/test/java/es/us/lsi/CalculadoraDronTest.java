package es.us.lsi;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculadoraDronTest {
    @Test
    public void testSuma() {
        CalculadoraDron calc = new CalculadoraDron();
        assertEquals(10, calc.sumar(5, 5));
    }
}