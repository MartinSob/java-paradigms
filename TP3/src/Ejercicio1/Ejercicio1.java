package Ejercicio1;

public class Ejercicio1 {

    public static double expresion_aritmetica(String expresion) {

        int[] result;

        if (expresion.contains("+")){
            result = split_string_by("+",expresion);
            return result[0] + result[1];
        }
        else if (expresion.contains("-")){
            result = split_string_by("-",expresion);
            return result[0] - result[1];
        }
        else if (expresion.contains("*")){
            result = split_string_by("*",expresion);
            return result[0] * result[1];
        }
        else if (expresion.contains("/")){
            result = split_string_by("/",expresion);
            if (result[1] != 0){
                return result[0] / result[1];
            }
            System.out.println("No se puede dividir por cero");
            return 0;
        }
        else {
            return 0;
        }
    }

    public static int[] split_string_by(String signo, String expresion){
        int[] result = {0,0};

        expresion = expresion.replace(signo, "EL_SIGNO");
        // Sino tiraba error el split porque el + - son char especiales
        String[] parts = expresion.split("EL_SIGNO");
        result[0] = Integer.parseInt(parts[0]) ; // 004
        result[1] = Integer.parseInt(parts[1]) ; // 004

        return result;
    }
}