package Ejercicio8;

public class Ejercicio8 {
    public static void main(String[] args){
        Buscar_combinaciones(3);
    }

    public static void Buscar_combinaciones(int numero){

        Combinaciones(numero, "");
    }

    public static void Combinaciones(int numero, String actual){
        if (actual.length() == numero) System.out.println(actual);
        else {
            Combinaciones(numero, actual+"M");
            Combinaciones(numero, actual+"F");
        }
    }
}