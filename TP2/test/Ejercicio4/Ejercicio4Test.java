package Ejercicio4;

import org.junit.Assert;
import org.junit.Test;

public class Ejercicio4Test {
    @Test
    public void calcular_el_nro() throws Exception {
        Assert.assertEquals(new Ejercicio4().calcular_el_nro(),2592);
    }


    @Test
    public void potencia_numeros() throws Exception {
        Assert.assertEquals(new Ejercicio4().potencia_numeros(1000), 1);
        Assert.assertEquals(new Ejercicio4().potencia_numeros(1010), 1);
        Assert.assertEquals(new Ejercicio4().potencia_numeros(1234), 81);
        Assert.assertEquals(new Ejercicio4().potencia_numeros(0423), 0);
    }

}