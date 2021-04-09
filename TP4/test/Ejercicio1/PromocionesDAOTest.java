package Ejercicio1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.ResultSet;


public class PromocionesDAOTest {
    static Conexion conn = new Conexion();

    @Before
    public void setUp() throws Exception {
        PlatoDAO.altaPlato("Milanesa con ensalada",75, new String[] {IngredienteDAO.get_Ingrediente_id("CarneParaMilanesa","Carne")});
        PlatoDAO.altaPlato("Fideos con salsa",75, new String[] {IngredienteDAO.get_Ingrediente_id("Fideos","Pasta"),IngredienteDAO.get_Ingrediente_id("Salsa","Otros")});
        BebidasDAO.altaBebida("Agua sin Gas",250, 30);
        BebidasDAO.altaBebida("Porron Cerveza",500, 70);
        PromocionesDAO.altaPromocion("Mila con ensalada",1,1,100);
        PromocionesDAO.altaPromocion("Fideos con bebida",2,2,100);
    }

    @After
    public void tearDown() throws Exception {
        conn.Declaracion.executeUpdate("TRUNCATE TABLE Plato");
        conn.Declaracion.executeUpdate("TRUNCATE TABLE Bebida");
        conn.Declaracion.executeUpdate("TRUNCATE TABLE Promocion");
    }

    @Test
    public void altaPromocion() throws Exception {
        PromocionesDAO.altaPromocion("HappyHour",2,2,35);
        ResultSet rs = conn.Declaracion.executeQuery("SELECT count(*) as Cantidad FROM Promocion WHERE Nombre = 'HappyHour'");
        while (rs.next()){
            Assert.assertTrue(rs.getString("Cantidad").equals("1"));
        }
    }

    @Test
    public void borrarPromocion() throws Exception {
        PromocionesDAO.borrarPromocion(1);
        ResultSet rs = conn.Declaracion.executeQuery("SELECT count(*) as Cantidad FROM Promocion WHERE id = 1");
        while (rs.next()){
            Assert.assertTrue(rs.getString("Cantidad").equals("0"));
        }
    }

    @Test
    public void modificarPROMOCION() throws Exception {
        PromocionesDAO.modificarPROMOCION(1,"HappyHour",2,2,2000);
        ResultSet rs = conn.Declaracion.executeQuery("SELECT * FROM Promocion WHERE Nombre = 'HappyHour' AND Plato_id = 2 AND Bebida_id = 2 AND Precio = 2000");
        while (rs.next()){
            Assert.assertTrue(rs.getString("Cantidad").equals("0"));
        }
    }

}