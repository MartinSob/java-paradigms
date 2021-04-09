package Ejercicio5;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

    public static ArrayList<ArrayList<Integer>> Trasponer_matriz(ArrayList<ArrayList<Integer>> matrix){
        int largo = matrix.size();
        int ancho = matrix.get(0).size();
        ArrayList<ArrayList<Integer>> copia_matriz = new ArrayList<>();

        for (int i = 0; i < ancho ; i++){
            ArrayList<Integer> raya = new ArrayList<>();
            for (int j = 0; j < largo ; j++){
                raya.add(matrix.get(j).get(i));
            }
            copia_matriz.add(raya);
        }
        return copia_matriz;
    }

    public static ArrayList<ArrayList<Integer>> read_file(String filepath){
        File file = new File("TP3/test/Ejercicio5/" + filepath + ".txt");
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        if(file.exists() && !file.isDirectory()) {
            try {
                Scanner scanner = new Scanner(file);
                String[] linea;

                while (scanner.hasNext()) {
                    ArrayList<Integer> raya = new ArrayList<>();
                    linea = scanner.nextLine().split("-");
                    for (String valor : linea) {
                        raya.add(Integer.parseInt(valor));
                    }
                    matrix.add(raya);
                }
                scanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Hubo un problema leyendo el archivo");
        }

        return matrix;
    }

    public static void Escribir_archivo(String path, ArrayList<ArrayList<Integer>> matrix){
        File out = new File("TP3/test/Ejercicio5/" + path + ".txt");
        PrintWriter writer = null;

        try {
            writer = new PrintWriter(out);
            for (ArrayList<Integer> fila : matrix) {
                boolean flag = true;
                for (int valor : fila) {
                    if (flag) {
                        writer.print(valor);
                        flag = false;
                    }
                    else writer.print("-" + valor);
                }
                writer.print("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.close();
    }
}
