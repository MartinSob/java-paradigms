package Ejercicio7;

public class Ejercicio7 {
    public static void main(String[] args){
        Pieza pieza1 = new Pieza();
        Pieza pieza2 = new Pieza();

        if(pieza1.paso_por_adentro_de_pieza(pieza2) || pieza2.paso_por_adentro_de_pieza(pieza1)) {
            System.out.println("Encajan sin girar");
        } else {
            pieza1.rotar_pieza();
            if(pieza1.paso_por_adentro_de_pieza(pieza2) || pieza2.paso_por_adentro_de_pieza(pieza1)) {
                System.out.println("Encajan girando");
            } else {
                System.out.println("No encajan");
            }
        }
    }
}