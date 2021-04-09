package Ejercicio3_4_5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class RegistroDeLasPersonasTest {

    @Test
    public void unicoTest() throws Exception {
        RegistroDeLasPersonas regDePersonas = new RegistroDeLasPersonas();
        regDePersonas.agregarPersona(new Persona("29111999","Luciano","Perez", new Direccion("34",567)));

        Assert.assertTrue(regDePersonas.cantidadPersonas() == 1);

        regDePersonas.agregarPersona(new Persona("30333666","Maricel","Gonzalez", new Direccion("34",567)));

        Assert.assertTrue(regDePersonas.cantidadPersonas() == 2);

        System.out.println("Cantidad: " + regDePersonas.cantidadPersonas());

        System.out.println(regDePersonas.recuperarPersona("30333666") + "\n");

        regDePersonas.agregarPersona(new Persona("29111999","Juan Andres","Perez", new Direccion("34",567)));

        Assert.assertTrue(regDePersonas.cantidadPersonas() == 3);
        // No se va a poder recuperar a alguno de los que tienen DNI iguales
        regDePersonas.imprimirListaDePersonas();
    }

}