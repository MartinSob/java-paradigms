package Ejercicio9;

import java.util.ArrayList;

public class Archivo {

    ArrayList<Archivo_row> rows = new ArrayList<Archivo_row>();

    public void Agregar_row(int clave, String valor1){
        rows.add(new Archivo_row(clave, valor1));
    }

    public void Agregar_row(int clave, String valor1, String valor2){
        rows.add(new Archivo_row(clave,valor1,valor2));
    }

    public Archivo Merge_archivos (Archivo archivo){
        Archivo archivo_merged = new Archivo();

        if (!this.check_claves() && !archivo.check_claves()){
            System.out.println("Claves repetidas en los archivos");
            return archivo_merged;
        }

        for (Archivo_row row: this.rows) {
            String value1 = this.Get_value_where_clave(row.clave);
            String value2 = archivo.Get_value_where_clave(row.clave);

            if (!value1.equals("") && !value2.equals("")){
                archivo_merged.Agregar_row(row.clave, value1, value2);
            }
        }

        return archivo_merged;
    }

    public boolean check_claves(){
        ArrayList<Integer> claves = new ArrayList<Integer>();

        for (Archivo_row row: this.rows) {
            if(!claves.contains(row.clave)){
                claves.add(row.clave);
            } else {
                return false;
            }
        }
        return true;
    }

    public String Get_value_where_clave(int clave){
        String value = "";
        for (Archivo_row row: this.rows) {
            if(row.clave == clave){
                    value = row.valor1;
            }
        }
        return value;
    }

    public static class Archivo_row {
        Integer clave;
        String valor1;
        String valor2;

        public Archivo_row(int clave, String valor1, String valor2){
            this.clave = clave;
            this.valor1 = valor1;
            this.valor2 = valor2;
        }

        public Archivo_row(int clave, String valor1){
            this.clave = clave;
            this.valor1 = valor1;
        }
    }
}



