package Ejercicio3;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio3 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String input;
        int ppt;

        System.out.println("Ingrese PIEDRA, PAPEL, TIJERA o SALIR: ");
        input = scan.next().toUpperCase();

        while(!(input.equals("SALIR"))) {
            ppt = rand.nextInt(2);

            who_won(ppt, input);

            System.out.println("Ingrese PIEDRA, PAPEL, TIJERA o SALIR: ");
            input = scan.next().toUpperCase();
        }

        System.out.println("CHAU!");
        scan.close();
    }

    public static void who_won(int ppt, String input) {

        // 0 --> Piedra
        // 1 --> Papel
        // 2 --> Tijera

        switch (input){
            case "PIEDRA":
                if (ppt == 0){
                    System.out.println("Piedra ==> Empate");
                } else if(ppt == 1){
                    System.out.println("Papel ==> Perdiste");
                } else {
                    System.out.println("Tijera ==> Ganaste!");
                }
                break;
            case "PAPEL":
                if (ppt == 0){
                    System.out.println("Piedra ==> Ganaste!");
                } else if(ppt == 1){
                    System.out.println("Papel ==> Empate");
                } else {
                    System.out.println("Tijera ==> Perdiste");
                }
                break;
            case "TIJERA":
                if (ppt == 0){
                    System.out.println("Piedra ==> Perdiste");
                } else if(ppt == 1){
                    System.out.println("Papel ==> Ganaste!");
                } else {
                    System.out.println("Tijera ==> Empate");
                }
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
