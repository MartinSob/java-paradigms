package Utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilidades {
    // Verifica si un numero es primo
    public static boolean check_if_primo(int number){
        int counter = 2;
        boolean result = true;

        while ((result) && (counter<number)){
            if (number % counter == 0)
                result = false;
            counter++;
        }
        return result;
    }

    // Pide al user ingresar un entero en la consola
    public static int get_int_console(){
        Scanner scan = new Scanner(System.in);
        int input = 0;
        boolean flag = true;

        while (flag){
            try{
                input = scan.nextInt();
                flag = false;
            } catch (InputMismatchException e){
                System.out.println("Ingresa un nro correcto: ");
            }
        }

        return input;
    }
}
