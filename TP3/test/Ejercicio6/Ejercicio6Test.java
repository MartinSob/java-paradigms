package Ejercicio6;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ejercicio6Test {
    @Test
    public void calcular_factorial() throws Exception {
        Assert.assertEquals(Ejercicio6.Calcular_factorial(5),120);
        Assert.assertEquals(Ejercicio6.Calcular_factorial(6),720);
        Assert.assertEquals(Ejercicio6.Calcular_factorial(0),1);
    }

}