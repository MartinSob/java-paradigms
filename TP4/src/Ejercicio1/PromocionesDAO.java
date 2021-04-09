package Ejercicio1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PromocionesDAO {

    static Conexion conn = new Conexion();

    public static void altaPromocion(String NOMBRE, int PLATO_ID, int BEBIDA_ID, int PRECIO) {

        try {
            conn.Declaracion.executeUpdate("INSERT INTO PROMOCION (NOMBRE, PLATO_ID,BEBIDA_ID ,PRECIO) VALUES ('" + NOMBRE + "'" + ", " + PLATO_ID + ", " + BEBIDA_ID + ", " + PRECIO + ")");
        } catch (java.lang.Throwable e) {
            System.out.println("Error");
        }
    }

    public static void borrarPromocion(int ID) {
        try {
            conn.Declaracion.executeUpdate("DELETE FROM PROMOCION WHERE ID = '" + ID + "'");
        } catch (java.lang.Throwable e) {
            System.out.println("Error");
        }
    }

    public static void modificarPROMOCION(int ID, String NOMBREnuevo, int PLATO_IDnuevo, int BEBIDA_IDnuevo, int PRECIOnuevo){
        try{
            conn.Declaracion.executeUpdate("UPDATE PROMOCION SET NOMBRE = '" + NOMBREnuevo + "', PLATO_ID = '" + PLATO_IDnuevo + "', BEBIDA_ID = '" + BEBIDA_IDnuevo + "' WHERE ID = '" + ID + "'");
        }
        catch (java.lang.Throwable e){System.out.println("Error");}
    }

    public static ArrayList<String> devolverPromociones(){
        ArrayList<String> promos = new ArrayList<>();
        try {
            ResultSet rs = conn.Declaracion.executeQuery("SELECT * FROM Promocion");
            while (rs.next()){
                promos.add(rs.getString("Nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return promos;
    }
}
