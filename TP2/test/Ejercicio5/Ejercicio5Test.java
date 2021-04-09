package Ejercicio5;

import org.junit.Assert;
import org.junit.Test;

public class Ejercicio5Test {
    @Test
    public void check_numbers() throws Exception {
        int[] numbers = {2,3,8,30,90,1,7};

        Assert.assertTrue(new Ejercicio5().check_numbers(numbers));

    }
}