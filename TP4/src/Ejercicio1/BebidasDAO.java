package Ejercicio1;

public class BebidasDAO {

    static Conexion conn = new Conexion();

    public static void altaBebida(String NOMBRE, double TAMANIO, int PRECIO){

        try{
            conn.Declaracion.executeUpdate("INSERT INTO BEBIDA (NOMBRE, TAMANO, PRECIO) VALUES ('" + NOMBRE + "'" + ", " + TAMANIO + ", " + PRECIO + ")");
        }
        catch (java.lang.Throwable e){System.out.println("Error");}
    }

    public static void borrarBebida(int ID){

        try{
            conn.Declaracion.executeUpdate("DELETE FROM BEBIDA WHERE ID = '" + ID + "'");
        }
        catch (java.lang.Throwable e){System.out.println("Error");}
    }

    public static void modificarBebida(int ID, int IDnuevo, String NOMBREnuevo, double TAMANIOnuevo, int PRECIOnuevo){

        try{
            conn.Declaracion.executeUpdate("UPDATE BEBIDA SET NOMBRE = '" + NOMBREnuevo + "', TAMANO = '" + TAMANIOnuevo + "' WHERE ID = " + ID);
        }
        catch (java.lang.Throwable e){System.out.println("Error");}
    }

    public static void borrarTodo(){

        try{
            conn.Declaracion.executeUpdate("TRUNCATE TABLE BEBIDA");
        }
        catch (java.lang.Throwable e){System.out.println("Error");}
    }

}