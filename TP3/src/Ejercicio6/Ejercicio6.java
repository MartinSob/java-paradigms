package Ejercicio6;

public class Ejercicio6 {
    public static void main(String[] args){
        System.out.println(Calcular_factorial(5));
    }

    public static int Calcular_factorial(int numero){
        int result = numero;
        if (numero < 0){
            System.out.println("Error matematico");
            return 0;
        } else if (numero == 0){
            return 1;
        } else if (numero > 1){
            result = numero * Calcular_factorial(numero-1);
        }
        return result;
    }
}
