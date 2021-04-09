package Utilidades;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class UtilidadesTest {
    @Test
    public void check_if_primo() throws Exception {
        Assert.assertTrue(new Utilidades().check_if_primo(3));
        Assert.assertTrue(new Utilidades().check_if_primo(7));
        Assert.assertFalse(new Utilidades().check_if_primo(6));

    }

}