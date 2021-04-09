package Ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args){

        ArrayList<Persona> personas = read_file("functions");

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese funcion: [ function(param1,param2) ] o SALIR");
        String input = scan.next().toUpperCase();

        while(!(input.equals("SALIR"))) {
            String[] linea = format_function(input);

            if (!linea[0].equals("ESHERMANO") && !linea[0].equals("ESABUELO") && !(linea[1].equals("") || linea[2].equals(""))){
                return;
            } else {
                // Se pregunta si es el hermano
                if (linea[0].equals("ESHERMANO")){
                    // Obtengo las personas involucradas
                    Persona persona1 = get_Persona(linea[1], personas);
                    Persona persona2 = get_Persona(linea[2], personas);

                    // Verifico Relacion
                    if (persona1.padre.equals(persona2.padre) || persona1.madre.equals(persona2.madre)){
                        System.out.println("Son hermanos");
                    } else {
                        System.out.println("No son hermanos");
                    }
                }
                // Se pregunta si es el abuelo
                else {
                    Persona persona1 = get_Persona(linea[1], personas);
                    Persona p1_madre = get_Persona(persona1.madre, personas);
                    Persona p1_padre = get_Persona(persona1.padre, personas);

                    if (p1_madre.padre.equals(linea[2]) || p1_madre.madre.equals(linea[2]) || p1_padre.padre.equals(linea[2]) || p1_padre.madre.equals(linea[2])){
                        System.out.println("Es el abuelo");
                    } else {
                        System.out.println("No es el abuelo");
                    }
                }
            }

            System.out.println("Ingrese funcion: [ function(param1,param2) ] o SALIR");
            input = scan.next().toUpperCase();
        }

        System.out.println("CHAU!");
        scan.close();
    }

    public static ArrayList<Persona> read_file(String filepath){
        ArrayList<Persona> personas = new ArrayList<Persona>();
        File file = new File("TP3/test/Ejercicio2/" + filepath + ".txt");
        if(file.exists() && !file.isDirectory()) {
            try {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNext()) {
                    String[] linea = format_function(scanner.nextLine());

                    Persona p_existente = get_Persona(linea[1], personas);
                    Persona p_nuevo = new Persona(linea);

                    if(p_existente.nombre.equals("")){
                        personas.add(p_nuevo);
                    } else {
                        if (p_existente.padre.equals("") && !p_nuevo.padre.equals("")){
                            p_existente.padre = p_nuevo.padre;
                        }
                        if (p_existente.madre.equals("") && !p_nuevo.madre.equals("")){
                            p_existente.madre = p_nuevo.madre;
                        }
                    }
                }
                scanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Hubo un problema leyendo el archivo");
        }

        return personas;
    }


    public static String[] format_function(String linea){
        String[] function_valores = linea.trim().split("\\(");
        String function = function_valores[0].toUpperCase(); // Nombre de la function
        String[] valores = function_valores[1].substring(0, function_valores[1].length()-1).toUpperCase().split(","); // values

        String[] result = {function,valores[0], valores[1]};
        return result;
    }


    public static Persona get_Persona(String name, ArrayList<Persona> personas){
        for (Persona p1: personas) {
            if (p1.nombre.equals(name)){
                return p1;
            }
        }
        return new Persona();
    }

}
