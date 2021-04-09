package Ejercicio4b;

import org.junit.Assert;
import org.junit.Test;


public class Ejercicio4bTest {
    @Test
    public void expresion_balanceada() throws Exception {
        Assert.assertTrue(new Ejercicio4b().Expresion_balanceada("{[1+2+(3*4)]/4}"));
        Assert.assertFalse(new Ejercicio4b().Expresion_balanceada("{[1+2+)3*4)]/4}"));
        Assert.assertFalse(new Ejercicio4b().Expresion_balanceada("{[1+2+(3*4)]/4"));
        Assert.assertFalse(new Ejercicio4b().Expresion_balanceada("{[1+2+(3*4])/4}"));
    }

}