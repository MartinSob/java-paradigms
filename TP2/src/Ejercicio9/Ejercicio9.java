package Ejercicio9;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio9 {

    public static void Merge_archivos(String path1, String path2, String path3){
        Archivo archivo1 = read_file(path1, false);
        Archivo archivo2 = read_file(path2, false);
        Archivo archivo3 = archivo1.Merge_archivos(archivo2);

        if (write_archivo(archivo3, path3)){
            System.out.println("Archivos mergeados");
        }
    }


    public static Archivo read_file(String filepath, boolean both_values){
        File file = new File("TP2/test/Ejercicio9/" + filepath + ".txt");
        Archivo archivo = new Archivo();
        if(file.exists() && !file.isDirectory()) {
            try {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNext()) {
                    String[] partes = scanner.nextLine().split(",");

                    // Si espera los dos valores del archivo o no
                    if (both_values){
                        archivo.Agregar_row(Integer.parseInt(partes[0].replaceAll("^\\s+|\\s+$", "")),partes[1].replaceAll("^\\s+|\\s+$", ""),partes[2].replaceAll("^\\s+|\\s+$", ""));
                    } else {
                        archivo.Agregar_row(Integer.parseInt(partes[0].replaceAll("^\\s+|\\s+$", "")),partes[1].replaceAll("^\\s+|\\s+$", ""));
                    }
                }
                scanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Hubo un problema leyendo el archivo");
        }

        return archivo;
    }

    public static boolean write_archivo(Archivo archivo, String path){
        File out = new File("TP2/test/Ejercicio9/" + path + ".txt");
        PrintWriter writer = null;

        try {
            writer = new PrintWriter(out);
            for (Archivo.Archivo_row row : archivo.rows) {
                writer.print(row.clave + "," + row.valor1 + "," + row.valor2 + " \n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        writer.close();
        return true;
    }
}
