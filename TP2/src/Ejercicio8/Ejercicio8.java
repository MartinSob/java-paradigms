package Ejercicio8;

import Utilidades.Utilidades;

public class Ejercicio8 {
    public static void main(String[] args){
        System.out.println("Profundidad: ");
        int profundidad = new Utilidades().get_int_console();

        Caracol caracol = new Caracol();
        System.out.println("El caracol tardara " + caracol.calcular_dias(profundidad) + " dias");
    }
}
