package Ejercicio2;


import java.util.ArrayList;

public class Pila {
    ArrayList<String> pila = new ArrayList<String>();

    public void push(String str){
        pila.add(str);
    }

    public void pop(){
        if (!pila.isEmpty()){
            pila.remove(pila.size()-1);
        }
    }

    public int largo(){
        return pila.size();
    }

    public boolean isEmpty(){
        return pila.isEmpty();
    }
}
