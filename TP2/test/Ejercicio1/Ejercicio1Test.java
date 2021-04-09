package Ejercicio1;

import org.junit.Assert;
import org.junit.Test;

public class Ejercicio1Test {

    @Test
    public void el_mayor() throws Exception {
        int[] numbers = {0,6,8,8,98,1};
        int[] buenos = {98,8};

        Assert.assertArrayEquals(new Ejercicio1().el_mayor(numbers),buenos);

    }

}