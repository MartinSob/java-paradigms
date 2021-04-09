package Ejercicio1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class NroComplejoTest {

    NroComplejo nro1;
    NroComplejo nro2;

    @Before
    public void setUp() throws Exception {
        nro1 = new NroComplejo(3.2f,4.1f);
        nro2 = new NroComplejo(5.1f,2.1f);
    }

    @After
    public void tearDown() throws Exception {
        nro1 = null;
        nro2 = null;
    }

    @Test
    public void sumarTest() throws Exception {
        nro1.sumar(nro2);
        NroComplejo nr3 = new NroComplejo(8.3f,6.2f);
        Assert.assertTrue(nro1.equals(nr3));
    }

    @Test
    public void restarTest() throws Exception {
        nro1.restar(nro2);
        NroComplejo nr3 = new NroComplejo(-1.9f,2f);
        Assert.assertTrue(nro1.equals(nr3));
    }

}