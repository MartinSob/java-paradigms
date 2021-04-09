package Ejercicio1;

import java.util.Arrays;

public class Ejercicio1 {
    public static int[] el_mayor(int[] numbers){
        int[] highest = {0,0};

        for (int number : numbers) {
            if (number > highest[1]){
                if (number > highest[0]){
                    highest[1] = highest[0];
                    highest[0] = number;
                } else {
                    highest[1] = number;
                }
            }
        }

        return highest;
    }
}
