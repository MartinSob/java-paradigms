package Ejercicio1;

import java.sql.SQLException;

public class Crear_Tablas {
    public static void main(String[] args) throws SQLException {
        Conexion conn = new Conexion();

        conn.Declaracion.executeUpdate("CREATE TABLE Plato (\n" +
                "  id INT NOT NULL AUTO_INCREMENT,\n" +
                "  Nombre VARCHAR(255) NOT NULL,\n" +
                "  Precio INT NOT NULL,\n" +
                "  PRIMARY KEY (id)\n" +
                ");");

        conn.Declaracion.executeUpdate("CREATE TABLE Plato_Ingrediente (\n" +
                "  id INT NOT NULL AUTO_INCREMENT,\n" +
                "  Plato_id INT NOT NULL,\n" +
                "  Ingrediente_id INT NOT NULL,\n" +
                "  PRIMARY KEY (id)\n" +
                ");");

        conn.Declaracion.executeUpdate("CREATE TABLE Ingrediente (\n" +
                "  id INT NOT NULL AUTO_INCREMENT,\n" +
                "  Nombre VARCHAR(255) NOT NULL,\n" +
                "  Tipo VARCHAR(255),\n" +
                "  PRIMARY KEY (id)\n" +
                ");\n");

        conn.Declaracion.executeUpdate("CREATE TABLE Bebida (\n" +
                "  id INT NOT NULL AUTO_INCREMENT,\n" +
                "  Nombre VARCHAR(255) NOT NULL,\n" +
                "  Tamano FLOAT,\n" +
                "  Precio INT,\n" +
                "  PRIMARY KEY (id)\n" +
                ");");

        conn.Declaracion.executeUpdate("CREATE TABLE Promocion (\n" +
                "  id INT NOT NULL AUTO_INCREMENT,\n" +
                "  Nombre VARCHAR(255) NOT NULL,\n" +
                "  Plato_id INT,\n" +
                "  Bebida_id INT,\n" +
                "  Precio INT,\n" +
                "  PRIMARY KEY (id)\n" +
                ");");
    }
}
