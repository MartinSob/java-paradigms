package Ejercicio5;

import Utilidades.Utilidades;
import java.io.*;

public class Ejercicio5 {

    public static boolean check_numbers(int[] numbers){
        // Chequeo si existen los archivos, y sino, los creo
        if(!new_empty_file("primos") || !new_empty_file("divisores_3000") || !new_empty_file("promedios")){
            System.out.println("Ha ocurrido un error");
            return false;
        }

        String primos = "";

        String divisores_3000 = "";

        int suma_par = 0;
        int suma_impar = 0;
        int cant_par = 0;
        int cant_impar = 0;

        for(int number : numbers){
            if (number % 2 == 0) {
                suma_par += number;
                cant_par ++;
            } else {
                suma_impar += number;
                cant_impar ++;
            }

            if (new Utilidades().check_if_primo(number)){
                primos = primos + number + " \n";
            }
            if (3000 % number == 0) {
                divisores_3000 = divisores_3000 + number + " \n";
            }
        }

        if(!write_file("primos",primos)){
            return false;
        }
        if (!write_file("divisores_3000",divisores_3000)){
            return false;
        }

        String par_impar = "Promedio pares: " + (float) suma_par/cant_par + " \n" +
                "Promedio impares: " + (float) suma_impar/cant_impar;

        if(!write_file("promedios",par_impar)){
            return false;
        }
        return true;
    }

    // Crea un archivo o, si ya existe, lo vacia
    public static boolean new_empty_file(String name){
        File file = new File("TP2/test/Ejercicio5/" + name + ".txt");
        if(file.exists() && !file.isDirectory()) {
            PrintWriter writer = null;
            try {
                writer = new PrintWriter(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return false;
            }
            writer.print("");
            writer.close();
        } else {
            FileOutputStream in = null;
            try {
                in = new FileOutputStream("TP2/test/Ejercicio5/" + name + ".txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    // Escribe un archivo
    public static boolean write_file(String file_name, String numbers){
        File out = new File("TP2/test/Ejercicio5/" + file_name + ".txt");
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(out);
            writer.print(numbers + " \n");
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        writer.close();
        return true;
    }
}
