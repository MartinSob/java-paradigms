package Ejercicio1;

import org.junit.*;

import java.sql.ResultSet;
import java.sql.SQLException;


public class TestPlatoDAO {

    static Conexion conn = new Conexion();

    @Before
    public void setUp() throws Exception {
        IngredienteDAO.altaIngrediente("CarneParaMilanesa", "Carne");
        IngredienteDAO.altaIngrediente("Lechuga", "Verdura");
        IngredienteDAO.altaIngrediente("Tomate", "Verdura");
        IngredienteDAO.altaIngrediente("Huevo", "Otros");
        IngredienteDAO.altaIngrediente("Fideos", "Pasta");
        IngredienteDAO.altaIngrediente("Salsa", "Otros");

        PlatoDAO.altaPlato("Milanesa", 70, new String[] {IngredienteDAO.get_Ingrediente_id("CarneParaMilanesa","Carne")});
        PlatoDAO.altaPlato("Ensalada Mixta", 50, new String[] {IngredienteDAO.get_Ingrediente_id("Lechuga","Verdura"),IngredienteDAO.get_Ingrediente_id("Tomate","Verdura"),IngredienteDAO.get_Ingrediente_id("Huevo","Otros")});
        PlatoDAO.altaPlato("Fideos con Salsa", 70, new String[] {IngredienteDAO.get_Ingrediente_id("Fideos","Pasta"),IngredienteDAO.get_Ingrediente_id("Salsa","Otros")});

    }

    @After
    public void tearDown() throws Exception {
        conn.Declaracion.executeUpdate("TRUNCATE TABLE Plato");
        conn.Declaracion.executeUpdate("TRUNCATE TABLE Ingrediente");
        conn.Declaracion.executeUpdate("TRUNCATE TABLE Plato_Ingrediente");
    }

    @Test
    public void testAltaPlato() throws SQLException {
        PlatoDAO.altaPlato("MilaNapo", 1000, new String[] {IngredienteDAO.get_Ingrediente_id("CarneParaMilanesa","Carne")});

        ResultSet rs = conn.Declaracion.executeQuery("SELECT count(*) as Cantidad FROM Plato WHERE Nombre = 'MilaNapo' AND Precio = 1000");
        while (rs.next()){
            Assert.assertTrue(rs.getString("Cantidad").equals("1"));
        }

        rs = conn.Declaracion.executeQuery("SELECT count(*) as Cantidad FROM Plato");
        while (rs.next()){
            Assert.assertTrue(rs.getString("Cantidad").equals("4"));
        }
    }

    @Test
    public void testIngredientes() throws SQLException {
        ResultSet rs = conn.Declaracion.executeQuery("SELECT count(*) as Cantidad FROM Plato_Ingrediente WHERE Plato_id = " + PlatoDAO.get_Plato_id("Ensalada Mixta",50));
        while (rs.next()){
            Assert.assertTrue(rs.getString("Cantidad").equals("3"));
        }
    }

    @Test
    public void testBaja() throws SQLException {
        PlatoDAO.borrarPlato("Milanesa");
        ResultSet rs = conn.Declaracion.executeQuery("SELECT count(*) as Cantidad FROM Plato WHERE Nombre = 'Milanesa'");
        while (rs.next()){
            Assert.assertTrue(rs.getString("Cantidad").equals("0"));
        }
    }

    @Test
    public void testModificacion() throws SQLException {
        PlatoDAO.modificarPlato("Fideos con Salsa","Guiso","15");
        ResultSet rs = conn.Declaracion.executeQuery("SELECT count(*) as Cantidad FROM Plato WHERE Nombre = 'Guiso'");
        while (rs.next()){
            Assert.assertTrue(rs.getString("Cantidad").equals("1"));
        }
    }

    @Test
    public void testCargaInicial() throws SQLException {
        ResultSet rs = conn.Declaracion.executeQuery("SELECT count(*) as Cantidad FROM Plato");
        while (rs.next()){
            Assert.assertTrue(rs.getString("CANTIDAD").equals("3"));
        }
    }

}