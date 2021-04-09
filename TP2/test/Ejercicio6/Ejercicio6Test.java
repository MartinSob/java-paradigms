package Ejercicio6;

import Utilidades.Utilidades;
import org.junit.Assert;
import org.junit.Test;

public class Ejercicio6Test {
    @Test
    public void get_primos_gemelos() throws Exception {
        Assert.assertArrayEquals(new Ejercicio6().get_primos_gemelos(10), new int[]{11,13});
        Assert.assertArrayEquals(new Ejercicio6().get_primos_gemelos(17), new int[]{17,19});
        Assert.assertArrayEquals(new Ejercicio6().get_primos_gemelos(3), new int[]{3,5});
        Assert.assertArrayEquals(new Ejercicio6().get_primos_gemelos(0), new int[]{1,3});
    }
}