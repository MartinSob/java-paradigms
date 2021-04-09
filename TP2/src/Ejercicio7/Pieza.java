package Ejercicio7;

import Utilidades.Utilidades;

public class Pieza {
    int largo;
    int ancho;

    public Pieza(){
        System.out.println("Ingrese el largo: ");
        largo = new Utilidades().get_int_console();
        System.out.println("Ingrese el ancho: ");
        ancho = new Utilidades().get_int_console();
    }

    public Pieza(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public boolean paso_por_adentro_de_pieza(Pieza pieza){
        if (largo < pieza.largo && ancho < pieza.ancho){
            return true;
        } else {
            return false;
        }
    }

    public void rotar_pieza() {
        int aux = largo;
        largo = ancho;
        ancho = aux;
    }
}
