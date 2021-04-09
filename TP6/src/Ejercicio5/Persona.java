package Ejercicio5;


import java.util.ArrayList;
import java.util.Random;

public class Persona {
public ArrayList<GenPersona> ListaDeGenesP = new ArrayList<>();
    public Persona(Genoma pGenoma){

        for (Gen mGen : pGenoma.ListaDeGenes){
            String Valor = new String();
            for (int i = 0; i == mGen.TamanoNucleotico; i++){
                Valor = Valor + SacarValor();
            }


            ListaDeGenesP.add(new GenPersona(mGen, Valor));
        }

    }

    private String SacarValor(){
        Integer Numero = new Random().nextInt(4);

        switch (Numero){
            case    0: return "A";
            case    1: return "C";
            case    2: return "G";
            case    3: return "T";

            default: return "E";

        }
    }



}
