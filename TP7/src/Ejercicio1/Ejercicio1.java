package Ejercicio1;

import java.util.ArrayList;

public class Ejercicio1 {

    public static void main(String[] args){
        ArrayList aLNoTipado = new ArrayList();
        ArrayList<String> aLTipado = new ArrayList<String>();

        aLNoTipado.add("UnElemento");
        aLTipado.add("UnElemento");

//        String unElemento = aLNoTipado.get(0);
        String otroElemento = aLTipado.get(0);

        aLNoTipado.add(3);
//        aLTipado.add(3);

    }
}
