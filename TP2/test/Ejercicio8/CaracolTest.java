package Ejercicio8;

import org.junit.Assert;
import org.junit.Test;

public class CaracolTest {
    @Test
    public void calcular_dias() throws Exception {
        int profundidad = 10;
        Caracol caracol = new Caracol(5,2);

        Assert.assertEquals(caracol.calcular_dias(profundidad), 3);

        profundidad = 0;
        Assert.assertEquals(caracol.calcular_dias(profundidad), 0);

        profundidad = -10;
        Assert.assertEquals(caracol.calcular_dias(profundidad), 0);

    }

}