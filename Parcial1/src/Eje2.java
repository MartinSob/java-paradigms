import java.util.ArrayList;

/**
 * Created by msobrero on 5/9/17.
 */
public class Eje2 {

    public static void main (String[] args){
        String result = secuencia_Genomica("AcCGTACCGTACCT", 3);

    }

    public static String secuencia_Genomica(String secuencia, int largo){
        secuencia = secuencia.toUpperCase();

        ArrayList<String> secuencias = new ArrayList<>();
        ArrayList<Integer> cantidades = new ArrayList<>();

        for (int i = 0 ; i < secuencia.length()-largo+1 ; i++){

            if (secuencias.contains(secuencia.substring(i, i+largo))){

                Integer cant = cantidades.get(secuencias.indexOf(secuencia.substring(i, i+largo))) + 1;
                cantidades.set(secuencias.indexOf(secuencia.substring(i, i+largo)), cant);

            } else {
                secuencias.add(secuencia.substring(i, i+largo));
                cantidades.add(1);
            }

        }

        int max = get_Higher(cantidades, secuencias);

        return secuencias.get(max);
    }

    public static int get_Higher(ArrayList<Integer> cantidades, ArrayList<String> secuencias){
        int limit = cantidades.size();
        int max = Integer.MIN_VALUE;
        int maxPos = -1;
        for (int i = 0; i < limit; i++) {
            int value = cantidades.get(i);
            if (value > max) {
                max = value;
                maxPos = i;
            } else if (value == max){
                String aux1 = secuencias.get(maxPos);
                String aux2 = secuencias.get(i);

                if (devolver_Multipl(aux2) < devolver_Multipl(aux1)){
                    maxPos = i;
                }
            }
        }

        return maxPos;
    }

    public static int devolver_Multipl(String string){
        String[] letras = string.split("(?!^)");
        int total = 1;

        for (String letra : letras){
            switch (letra){
                case "A":
                    total *=1;
                    break;
                case "C":
                    total *=2;
                    break;
                case "G":
                    total *=3;
                    break;
                case "T":
                    total *=4;
                    break;
            }
        }

        return total;
    }
}
