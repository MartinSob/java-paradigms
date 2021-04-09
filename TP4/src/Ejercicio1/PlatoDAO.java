package Ejercicio1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PlatoDAO {

    static Conexion conn = new Conexion();

    public static boolean altaPlato(String nombre, int precio, String[] ingredientes) {
        try {
            conn.Declaracion.executeUpdate("INSERT INTO Plato (Nombre, Precio) VALUES ('" + nombre + "', '" + precio + "')");
            String id_Plato = PlatoDAO.get_Plato_id(nombre,precio);

            if (ingredientes != null && ingredientes.length > 0) {
               for (String ingrediente : ingredientes){
                   PlatoDAO.matchPlato_Ingrediente(id_Plato, ingrediente);
                }
            } else {
                return false;
            }
            return true;
        } catch (java.lang.Throwable e) {
            System.out.println("Error");
            return false;
        }
    }

    public static boolean matchPlato_Ingrediente(String Plato_id, String Ingrediente_id){
        try {
            conn.Declaracion.executeUpdate("INSERT INTO Plato_Ingrediente (Plato_id, Ingrediente_id) VALUES (" + Plato_id + ", " + Ingrediente_id + ")");
            return true;
        } catch (java.lang.Throwable e) {
            System.out.println("Errory");
            return false;
        }
    }

    public static boolean borrarPlato(String nombre) {
        try {
            conn.Declaracion.executeUpdate("DELETE FROM Plato WHERE Nombre = '" + nombre + "'");
            return true;
        } catch (java.lang.Throwable e) {
            System.out.println("Error");
            return false;
        }
    }

    public static boolean modificarPlato(String nombreViejo, String nombreNuevo, String precioNuevo){
        try {
            conn.Declaracion.executeUpdate("UPDATE Plato SET Nombre = '" + nombreNuevo + "', Precio = '" + precioNuevo + "' WHERE Nombre = '" + nombreViejo + "'");
            return true;
        } catch (java.lang.Throwable e) {
            System.out.println("Error");
            return false;
        }
    }

    public static ArrayList<String> devolverPlatos(){
        ArrayList<String> platos = new ArrayList<>();
        try {
            ResultSet rs = conn.Declaracion.executeQuery("SELECT * FROM Plato");
            while (rs.next()){
                platos.add(rs.getString("Nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return platos;
    }

    public static String get_Plato_id(String nombre, int precio){
        try {
//            System.out.println("SELECT id FROM Plato WHERE Nombre = '" + nombre + "' AND Precio = " + precio + " ");
            ResultSet rs = conn.Declaracion.executeQuery("SELECT id FROM Plato WHERE Nombre = '" + nombre + "' AND Precio = " + precio);
            while (rs.next()){
                return rs.getString("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "0";
    }
    
}
