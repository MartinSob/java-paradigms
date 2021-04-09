package Ejercicio2;

import org.junit.Assert;
import org.junit.Test;

public class Ejercicio2Test {
    @Test
    public void more_evens() throws Exception {
        int[] numeros = {12947, 6485, 1, 2, 321654987, 1};
        int[] buenos = {321654987, 4};

        Assert.assertArrayEquals(new Ejercicio2().more_evens(numeros),buenos);

    }

}