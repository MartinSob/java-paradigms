import java.util.ArrayList;

/**
 * Created by msobrero on 5/9/17.
 */
public class Eje1 {

    public static void main (String[] args) {
        ArrayList<String> array_Final = new ArrayList<String>();
        Combinaciones(3,"",3, array_Final);
    }


    public static void Combinaciones(int numero, String actual, int k, ArrayList<String> array_Final){
        if (actual.length() == k){
            array_Final.add(actual);
        } else {
            for (int i = 1 ; i <= numero ; i++){

                if (!actual.contains(String.valueOf(i))){
                    Combinaciones( numero,actual+String.valueOf(i), k, array_Final);
                }
            }

        }
    }
}
