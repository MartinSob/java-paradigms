package Ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class Conexion {

    static Connection Coneccion;
    static Statement Declaracion;


    public Conexion() {
        try{
            Class.forName("org.h2.Driver");
            Coneccion = DriverManager.getConnection("jdbc:h2:~/test", "admin", "123456");
            Declaracion = Coneccion.createStatement();
        }
        catch (java.lang.Throwable e){
            System.out.println("Error");
        }
    }
}
