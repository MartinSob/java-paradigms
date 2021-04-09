package Ejercicio7;

import org.junit.Assert;
import org.junit.Test;

public class PiezaTest {
    @Test
    public void paso_por_adentro_de_pieza() throws Exception {
        Pieza pieza1 = new Pieza(7,5);
        Pieza pieza2 = new Pieza(6,4);

        Assert.assertTrue(pieza2.paso_por_adentro_de_pieza(pieza1));
        Assert.assertFalse(pieza1.paso_por_adentro_de_pieza(pieza2));
    }

    @Test
    public void rotar_pieza() throws Exception {
        Pieza pieza1 = new Pieza(5,6);
        Pieza pieza2 = new Pieza(6,5);

        pieza2.rotar_pieza();

        Assert.assertArrayEquals(new int[]{pieza1.largo,pieza1.ancho},new int[]{pieza2.largo,pieza2.ancho});
    }

}