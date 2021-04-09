package Ejercicio1;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class IngredienteDAO {

    static Conexion conn = new Conexion();

    public static boolean altaIngrediente(String nombre, String tipo) {
        try {
            conn.Declaracion.executeUpdate("INSERT INTO Ingrediente (Nombre, Tipo) VALUES ('" + nombre + "', '" + tipo + "')");
            return true;
        } catch (java.lang.Throwable e) {
            System.out.println("Error");
            return false;
        }
    }

    public static boolean borrarIngrediente(String nombre) {
        try {
            conn.Declaracion.executeUpdate("DELETE FROM Ingrediente WHERE Nombre = '" + nombre + "'");
            return true;
        } catch (java.lang.Throwable e) {
            System.out.println("Error");
            return false;
        }
    }

    public static boolean modificarIngrediente(String nombreViejo, String nombreNuevo, String tipoNuevo){
        try {
            conn.Declaracion.executeUpdate("UPDATE Ingrediente SET Nombre = '" + nombreNuevo + "', Tipo = '" + tipoNuevo + "' WHERE Nombre = '" + nombreViejo + "'");
            return true;
        } catch (java.lang.Throwable e) {
            System.out.println("Error");
            return false;
        }
    }

    public static ArrayList<String> devolverIngredientes(){
        ArrayList<String> ingredientes = new ArrayList<>();
        try {
            ResultSet rs = conn.Declaracion.executeQuery("SELECT * FROM Ingrediente");
            while (rs.next()){
                ingredientes.add(rs.getString("Nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ingredientes;
    }

    public static ArrayList<String> devolverLasVerduras(){
        ArrayList<String> ingredientes = new ArrayList<>();
        try {
            ResultSet rs = conn.Declaracion.executeQuery("SELECT * FROM Ingrediente WHERE Tipo = 'Verdura'");
            while (rs.next()){
                ingredientes.add(rs.getString("Nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ingredientes;
    }

    public static String get_Ingrediente_id(String nombre, String tipo){
        try {
            ResultSet rs = conn.Declaracion.executeQuery("SELECT id FROM Ingrediente WHERE Nombre = '" + nombre + "' AND Tipo = '" + tipo + "' ");
            while (rs.next()){
                return rs.getString("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "NaN";
    }

}