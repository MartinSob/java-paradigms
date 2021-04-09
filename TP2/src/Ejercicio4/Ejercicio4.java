package Ejercicio4;

public class Ejercicio4 {
    public static int calcular_el_nro(){

        for (int numero = 1000 ; numero <= 9999 ; numero++){
            if (potencia_numeros(numero) == numero) {
                System.out.println("El nro es: " + numero);
                return numero;
            }
        }

        System.out.println("No lo encontre");
        return 0;
    }

    public static int potencia_numeros(int numero){
        int[] n = {0,0,0,0};
        int i = 10;
        int contador = 0;

        while (numero > 0) {
            n[contador] = (numero % i);
            numero /= 10;
            contador++;
        }

        return (int) (Math.pow(n[3],n[2]) * Math.pow(n[1],n[0]));
    }

}
