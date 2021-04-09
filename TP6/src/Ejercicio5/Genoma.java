package Ejercicio5;

import java.util.ArrayList;

public class Genoma {

    public ArrayList<Gen> ListaDeGenes = new ArrayList<Gen>();
    public Genoma(){
        for(int i=0; i<25000; i++){
            Gen mGen = new Gen();
            mGen.Id = i;
            ListaDeGenes.add(mGen);
        }
    }
}
