package Ejercicio4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CMTest {

    @Before
    public void setUp() throws Exception {
        CM.crearContacto("Ted","Mosby","43121234","tmosby@gmail.com");
    }

    @After
    public void tearDown() throws Exception {
        CM.contactos.clear();
        CM.grupos.clear();
    }

    @Test
    public void crearContactoTest() throws Exception {
        Assert.assertTrue(CM.contactos.size() == 1);
    }

    @Test
    public void modificarContactoTest() throws Exception {
        CM.modificarContacto(CM.contactos.get(0),"Sheldon","Cooper","43121234","scooper@gmail.com");

        Assert.assertTrue(CM.contactos.get(0).apellido.equals("Cooper"));
    }

    @Test
    public void borrarContactoTest() throws Exception {
        Grupo group = new Grupo("Facultad");
        CM.grupos.add(group);
        group.agregarContacto(CM.contactos.get(0));

        Assert.assertTrue(group.contactos.size() == 1);

        CM.borrarContacto(CM.contactos.get(0));

        Assert.assertTrue(CM.contactos.size() == 0);
        Assert.assertTrue(group.contactos.size() == 0);
    }

    @Test
    public void sacarContactoTestGrupo() throws Exception {
        CM.grupos.add(new Grupo("Facultad"));
        CM.agregarContactoGrupo(CM.contactos.get(0),CM.grupos.get(0));

        Assert.assertTrue(CM.grupos.get(0).contactos.size() == 1);

        CM.sacarContactoGrupo(CM.contactos.get(0),CM.grupos.get(0));

        Assert.assertTrue(CM.grupos.get(0).contactos.size() == 0);
    }

    @Test
    public void agregarContactoTestGrupo() throws Exception {
        CM.grupos.add(new Grupo("Facultad"));

        CM.agregarContactoGrupo(CM.contactos.get(0),CM.grupos.get(0));

        Assert.assertTrue(CM.grupos.get(0).contactos.size() == 1);
    }

}