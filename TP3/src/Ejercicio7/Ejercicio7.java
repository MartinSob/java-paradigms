
package Ejercicio7;

public class Ejercicio7 {

    // 0 - 1 - 1 - 2 - 3 - 5 - 8 - 13 - 21 - 34


    public static int Fibonacci(int number){
        return Calcular_Fibonacci(number,1,0);
    }

    public static int Calcular_Fibonacci(int number, int anterior, int actual){
        if (number == 0){
            System.out.println("Las posicione de la serie empiezan en 1");
            return 0;
        }
        // Se pide la primera posicion
        else if (number == 1 && actual == 0) return 0;
        // Final de recursion
        else if (number == 1) return actual;
        else {
            return Calcular_Fibonacci(number-1, actual, actual + anterior);
        }
    }
}
