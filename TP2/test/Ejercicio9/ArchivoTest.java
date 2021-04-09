package Ejercicio9;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArchivoTest {
    @Test
    public void merge_archivos() throws Exception {
        Archivo file1 = new Archivo();
        Archivo.Archivo_row row11 = new Archivo.Archivo_row(1,"1");
        file1.rows.add(row11);
        Archivo.Archivo_row row12 = new Archivo.Archivo_row(2,"2");
        file1.rows.add(row12);
        Archivo.Archivo_row row13 = new Archivo.Archivo_row(3,"3");
        file1.rows.add(row13);

        Archivo file2 = new Archivo();
        Archivo.Archivo_row row21 = new Archivo.Archivo_row(4,"4");
        file2.rows.add(row21);
        Archivo.Archivo_row row22 = new Archivo.Archivo_row(2,"2");
        file2.rows.add(row22);
        Archivo.Archivo_row row23 = new Archivo.Archivo_row(3,"3");
        file2.rows.add(row23);

        Archivo file3 = file1.Merge_archivos(file2);

        Archivo file4 = new Archivo();
        Archivo.Archivo_row row41 = new Archivo.Archivo_row(2,"2","2");
        file4.rows.add(row41);
        Archivo.Archivo_row row42 = new Archivo.Archivo_row(3,"3","3");
        file4.rows.add(row42);

        for (int i = 0; i < 2 ; i++) {
            Assert.assertEquals(file3.rows.get(i).clave , file4.rows.get(i).clave);
            Assert.assertEquals(file3.rows.get(i).valor1 , file4.rows.get(i).valor1);
            Assert.assertEquals(file3.rows.get(i).valor2 , file4.rows.get(i).valor2);
        }
    }

    @Test
    public void check_claves() throws Exception {
        Archivo file = new Archivo();
        Archivo.Archivo_row row = new Archivo.Archivo_row(1,"1","1");
        file.rows.add(row);
        Archivo.Archivo_row row2 = new Archivo.Archivo_row(2,"2","2");
        file.rows.add(row2);
        Archivo.Archivo_row row3 = new Archivo.Archivo_row(3,"3","3");
        file.rows.add(row3);

        Assert.assertTrue(file.check_claves());

        Archivo.Archivo_row row4 = new Archivo.Archivo_row(3,"3","3");
        file.rows.add(row4);

        Assert.assertFalse(file.check_claves());
    }

    @Test
    public void get_value_where_clave() throws Exception {
        Archivo file = new Archivo();
        Archivo.Archivo_row row = new Archivo.Archivo_row(1,"1");
        file.rows.add(row);
        Archivo.Archivo_row row2 = new Archivo.Archivo_row(2,"2");
        file.rows.add(row2);
        Archivo.Archivo_row row3 = new Archivo.Archivo_row(3,"3");
        file.rows.add(row3);

        Assert.assertEquals(file.Get_value_where_clave(2),"2");
        Assert.assertEquals(file.Get_value_where_clave(3),"3");
    }

}