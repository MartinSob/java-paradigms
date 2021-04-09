package Ejercicio1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.Statement;


public class BebidasDAOTest {

    @Before
    public void setUp() throws Exception {
        BebidasDAO.altaBebida("Cerveza Stella", 1000, 80);
        BebidasDAO.altaBebida("Cerveza Stella", 330, 40);
        BebidasDAO.altaBebida("Coca-Cola", 600, 40);
        BebidasDAO.altaBebida("Agua sin gas", 1000, 30);
    }

    @After
    public void tearDown() throws Exception {
       BebidasDAO.borrarTodo();
    }

    @Test
    public void altaBebida() throws Exception {
        BebidasDAO.altaBebida("Pepsi", 500, 35);
        ResultSet rs = Conexion.Declaracion.executeQuery("SELECT count(*) as Cantidad FROM BEBIDA");
        while (rs.next()){
            Assert.assertTrue(rs.getString("Cantidad").equals("5"));
        }
    }

    @Test
    public void borrarBebida() throws Exception {
        Boolean Flag = false;
        BebidasDAO.borrarBebida(3);
        ResultSet rs = Conexion.Declaracion.executeQuery("SELECT * FROM BEBIDA WHERE ID = 3");

        Assert.assertFalse(rs.next());
    }

    @Test
    public void modificarBebida() throws Exception {
        BebidasDAO.modificarBebida(2, 2, "Cerveza Quilmes", 330, 40);
        ResultSet rs = Conexion.Declaracion.executeQuery("SELECT Nombre FROM BEBIDA WHERE ID = 2");
        while (rs.next()){
            Assert.assertTrue(rs.getString("NOMBRE").equals("Cerveza Quilmes"));

        }
    }

    @Test
    public void cargaInicial() throws Exception{
        Conexion conn = new Conexion();
        int cont = 0;
        ResultSet rs = conn.Declaracion.executeQuery("SELECT * FROM BEBIDA");
        while (rs.next()){cont++;}
        Assert.assertEquals(4, cont);
    }

}