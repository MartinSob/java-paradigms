package Ejercicio6;

import Utilidades.Utilidades;


public class Ejercicio6 {

    public static int[] get_primos_gemelos(int number){
        number = (number == 0)? ++number: number;
        while(true){
            if(new Utilidades().check_if_primo(number) && new Utilidades().check_if_primo(number +2)){
                int[] result = {number,number+2};
                return result;
            } else {
                number++;
            }
        }
    }
}
