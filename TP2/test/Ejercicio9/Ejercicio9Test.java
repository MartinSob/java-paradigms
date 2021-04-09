package Ejercicio9;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class Ejercicio9Test {

    @Test
    public void Merge_archivos() throws Exception {
        Ejercicio9.Merge_archivos("Archivo1", "Archivo2", "Archivo3");
        Archivo file1 = Ejercicio9.read_file("Archivo3", true);

        Archivo file4 = new Archivo();
        Archivo.Archivo_row row41 = new Archivo.Archivo_row(10,"1","3");
        file4.rows.add(row41);
        Archivo.Archivo_row row42 = new Archivo.Archivo_row(1,"6","7");
        file4.rows.add(row42);

        for (int i = 0; i < 2 ; i++) {
            Assert.assertEquals(file1.rows.get(i).clave , file4.rows.get(i).clave);
            Assert.assertEquals(file1.rows.get(i).valor1 , file4.rows.get(i).valor1);
            Assert.assertEquals(file1.rows.get(i).valor2 , file4.rows.get(i).valor2);
        }

    }
}