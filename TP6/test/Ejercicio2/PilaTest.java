package Ejercicio2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class PilaTest {

    Pila pila;

    @Before
    public void setUp() throws Exception {
       this.pila = new Pila();
    }

    @After
    public void tearDown() throws Exception {
        pila = null;
    }

    @Test
    public void pushTest() throws Exception {
        pila.push("Lorem");
        Assert.assertTrue(pila.largo() == 1);
        pila.push("Ipsum");
        Assert.assertTrue(pila.largo() == 2);
        pila.push("Dolor");
        Assert.assertTrue(pila.largo() == 3);
    }

    @Test
    public void popTest() throws Exception {
        pila.push("Lorem");
        pila.push("Ipsum");
        pila.push("Dolor");

        pila.pop();
        Assert.assertTrue(pila.largo() == 2);
    }

    @Test
    public void lengthTest() throws Exception {
        pila.push("Lorem");
        pila.push("Ipsum");
        pila.push("Dolor");
        Assert.assertTrue(pila.largo() == 3);

        pila.pop();
        Assert.assertTrue(pila.largo() == 2);

    }

    @Test
    public void isEmptyTest() throws Exception {
        Assert.assertTrue(pila.isEmpty());
        pila.push("Lorem");
        Assert.assertFalse(pila.isEmpty());
    }

}