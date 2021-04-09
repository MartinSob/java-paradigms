package Ejercicio2;

public class Ejercicio2 {

    public static int[] more_evens(int[] numbers){
        int[] resultado = {0,0};

        for(int number : numbers){
            if(get_evens(number) > resultado[1]){
                resultado[1] = get_evens(number);
                resultado[0] = number;
            }
        }

        return resultado;

    }

    public static int get_evens(int number) {
        int quantity = 0;
        int i = 10;

        while (i < number) {
            if ((number % i) % 2 == 0) {
                quantity++;
            }
            number /= 10;
        }

        if (number % 2 == 0) {
            quantity++;
        }

        return quantity;
    }
}
