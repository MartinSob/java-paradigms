package Ejercicio1;

import org.junit.Assert;
import org.junit.Test;

public class Ejercicio1Test {
    @Test
    public void expresion_aritmetica() throws Exception {
        Assert.assertTrue(new Ejercicio1().expresion_aritmetica("3+2") == 5);
        Assert.assertEquals(new Ejercicio1().expresion_aritmetica("5-3"),2.0,0);
        Assert.assertEquals(new Ejercicio1().expresion_aritmetica("3*7"),21.0,0);
        Assert.assertEquals(new Ejercicio1().expresion_aritmetica("4/2"),2.0,0);
        Assert.assertEquals(new Ejercicio1().expresion_aritmetica("6/0"),0.0,0);
    }

    @Test
    public void split_string_by() throws Exception {
        Assert.assertArrayEquals(new Ejercicio1().split_string_by("+","123+321"), new int[]{123,321});
        Assert.assertArrayEquals(new Ejercicio1().split_string_by("aaa","123aaa31"), new int[]{123,31});
        Assert.assertArrayEquals(new Ejercicio1().split_string_by("-","0-31"), new int[]{0,31});
    }

}