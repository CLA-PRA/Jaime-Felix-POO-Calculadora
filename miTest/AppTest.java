package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static Calculadora c;

    @BeforeAll public static void setUp() {
        c = new Calculadora();
    }

    @Test public void testSumar() {
        assertTrue(c.sumar(2,3)==5);
    }

    @Test public void testRestar() {
        assertTrue(c.restar(4,2)==2);
    }

    @Test public void testMultiplicar() {
        assertTrue(c.multiplicar(5,7)==35);
    }

    @Test public void testDividir() {
        assertTrue(c.dividir(12,4)==3);
    }
}