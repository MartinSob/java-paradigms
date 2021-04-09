package Ejercicio6;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class TeatroTest {

    Teatro t1;

    @Before
    public void setUp() throws Exception {
        t1 = new Teatro();
        t1.AgregarTicket(new Ticket(Teatro.tipoLocalidad.Adelante));
        t1.AgregarTicket(new Ticket(Teatro.tipoLocalidad.Medio));
        t1.AgregarTicket(new Ticket(Teatro.tipoLocalidad.Atras));
    }

    @After
    public void tearDown() throws Exception {
        t1 = null;
    }

    @Test
    public void AgregarTicketTest() throws Exception {
        for (Ticket ticket : t1.tickets) {
            System.out.println(ticket);
        }

        Assert.assertTrue(t1.tickets.size() == 3);
    }

    @Test
    public void ConsultarMontoTest() throws Exception {
        Assert.assertTrue(t1.tickets.get(0).getPrecio() == 5);
        Assert.assertTrue(t1.getPrecioEnDolares(Teatro.tipoLocalidad.Adelante) == 80);
        Assert.assertTrue(t1.getPrecioEnEuros(Teatro.tipoLocalidad.Adelante) == 90);
    }

    @Test
    public void imprimirLocalidadesTest() throws Exception {
        t1.imprimirLocalidades();
    }
}