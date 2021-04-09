package Ejercicio4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class GrupoTest {

    Grupo group;
    Contacto contact1;
    Contacto contact2;

    @Before
    public void setUp() throws Exception {
        group = new Grupo("Facultad");
        contact1 = new Contacto("Ted","Mosby","43121234","tmosby@gmail.com");
        contact2 = new Contacto("Sheldon","Cooper","43121234","scooper@gmail.com");
    }

    @After
    public void tearDown() throws Exception {
        group = null;
        contact1 = null;
        contact2 = null;
    }

    @Test
    public void agregarContactoTest() throws Exception {
        group.agregarContacto(contact1);

        Assert.assertTrue(group.contactos.size() == 1);

        group.agregarContacto(contact2);

        Assert.assertTrue(group.contactos.size() == 2);
    }

    @Test
    public void sacarContactoTest() throws Exception {
        group.agregarContacto(contact1);

        Assert.assertTrue(group.contactos.size() == 1);

        group.sacarContacto(contact1);

        Assert.assertTrue(group.contactos.size() == 0);
    }

}