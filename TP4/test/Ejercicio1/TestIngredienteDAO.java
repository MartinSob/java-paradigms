package Ejercicio1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class TestIngredienteDAO {

    static Conexion conn = new Conexion();

    @Before
    public void setUp() throws SQLException {
         IngredienteDAO.altaIngrediente("Papa", "Verdura");
         IngredienteDAO.altaIngrediente("carneParaMilanesa", "Carne");
         IngredienteDAO.altaIngrediente("panRallado", "Otros");
         IngredienteDAO.altaIngrediente("Huevo", "Otros");
         IngredienteDAO.altaIngrediente("Lechuga", "Verdura");
         IngredienteDAO.altaIngrediente("Tomate", "Verdura");
         IngredienteDAO.altaIngrediente("Fideos", "Pasta");
         IngredienteDAO.altaIngrediente("Salsa", "Otros");
         IngredienteDAO.altaIngrediente("Cebolla", "Verdura");
    }

    @Test
    public void testCargaInicial() throws SQLException {
        ResultSet rs = conn.Declaracion.executeQuery("SELECT count(*) as Cantidad FROM Ingrediente");
        while (rs.next()){
            Assert.assertTrue(rs.getString("CANTIDAD").equals("9"));
        }
    }

    @Test
    public void testAltaIngrediente() throws SQLException {
        IngredienteDAO.altaIngrediente("Queso", "Lacteo");

        ResultSet rs = conn.Declaracion.executeQuery("SELECT count(*) as Cantidad FROM Ingrediente WHERE Nombre = 'Queso' AND Tipo = 'Lacteo'");
        while (rs.next()){
            Assert.assertTrue(rs.getString("Cantidad").equals("1"));
        }

        rs = conn.Declaracion.executeQuery("SELECT count(*) as Cantidad FROM Ingrediente");
        while (rs.next()){
            Assert.assertTrue(rs.getString("Cantidad").equals("10"));
        }
    }

    @Test
    public void testModificacion() throws SQLException {
        IngredienteDAO.modificarIngrediente("Huevo","Jamon","Fiambre");
        ResultSet rs = conn.Declaracion.executeQuery("SELECT count(*) as Cantidad FROM Ingrediente WHERE Nombre = 'Jamon'");
        while (rs.next()){
            Assert.assertTrue(rs.getString("Cantidad").equals("1"));
        }
    }

    @Test
    public void testDevolverVerduras(){
        ArrayList<String> verduras = IngredienteDAO.devolverLasVerduras();
        boolean flag = true;
        ArrayList<String> verdus = new ArrayList<>();
        verdus.add("Papa");
        verdus.add("Lechuga");
        verdus.add("Tomate");
        verdus.add("Cebolla");
        for (String verdura : verduras){
            if (!verdus.contains(verdura)){
                flag = false;
            }
        }
        Assert.assertTrue(flag);
    }

    @Test
    public void testBaja() throws SQLException {
        IngredienteDAO.borrarIngrediente("Lechuga");
        ResultSet rs = conn.Declaracion.executeQuery("SELECT count(*) as Cantidad FROM Ingrediente WHERE Nombre = 'Lechuga'");
        while (rs.next()){
            Assert.assertTrue(rs.getString("Cantidad").equals("0"));
        }
    }

    @After
    public void tearDown() throws SQLException {
        conn.Declaracion.executeUpdate("TRUNCATE TABLE Ingrediente");
    }

}
