package Ejercicio5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class ClaseTest {
    @Test
    public void crear() throws Exception {
        Genoma mGenoma = new Genoma();
        Persona mPersona = new Persona(mGenoma);
        Persona mPersona2 = new Persona(mGenoma);


        Assert.assertTrue(CheckGenes(mPersona,mPersona));


    }

    private boolean CheckGenes(Persona per1, Persona per2) {
        boolean Flag = true;

        for(int i=1; i<25000; i++){

            if(Flag){

                if (per1.ListaDeGenesP.get(i) != per2.ListaDeGenesP.get(i)){
                    Flag = false;
                }

            }
        }
        return Flag;
    }
}