package FactoryMethod;


import java.util.Scanner;

public class Cliente {

    public static void main(String[] args){
    String Tipo = new String();

        FabricaEnemigos Fabrica = new FabricaEnemigos();
        Enemigo Enemigo;

        System.out.println("Ingrese el tipo de enemigo");
        Scanner SC = new Scanner(System.in);
        Tipo = SC.next();


        Enemigo = Fabrica.Crear(Tipo.toUpperCase());

        if (Enemigo == null) {
            System.out.println("Tipo de enemigo invalido");
        } else {
            System.out.println("Se creo: " + Enemigo.Nombre);

        }
    }

    }




