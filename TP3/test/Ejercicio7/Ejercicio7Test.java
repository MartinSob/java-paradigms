package Ejercicio7;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ejercicio7Test {
    @Test
    public void calcular_Fibonacci() throws Exception {
        Assert.assertEquals(Ejercicio7.Fibonacci(0),0);
        Assert.assertEquals(Ejercicio7.Fibonacci(1),0);
        Assert.assertEquals(Ejercicio7.Fibonacci(2),1);
        Assert.assertEquals(Ejercicio7.Fibonacci(3),1);
        Assert.assertEquals(Ejercicio7.Fibonacci(4),2);
        Assert.assertEquals(Ejercicio7.Fibonacci(5),3);
        Assert.assertEquals(Ejercicio7.Fibonacci(6),5);
        Assert.assertEquals(Ejercicio7.Fibonacci(7),8);
        Assert.assertEquals(Ejercicio7.Fibonacci(8),13);
        Assert.assertEquals(Ejercicio7.Fibonacci(9),21);
    }

}