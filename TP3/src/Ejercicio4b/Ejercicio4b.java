package Ejercicio4b;

import java.util.Stack;

public class Ejercicio4b {


    public static boolean Expresion_balanceada(String expresion){
        Stack pila = new Stack();

        for (char caracter : expresion.toCharArray()) {
            switch (caracter) {
                case '(':
                    pila.add(caracter);
                    break;
                case '[':
                    pila.add(caracter);
                    break;
                case '{':
                    pila.add(caracter);
                    break;

                case ')':
                    if (pila.peek().equals('(')){
                        pila.pop();
                    } else return false;
                    break;
                case ']':
                    if (pila.peek().equals('[')){
                        pila.pop();
                    } else return false;
                    break;
                case '}':
                    if (pila.peek().equals('{')){
                        pila.pop();
                    } else return false;
                    break;
            }

        }

        if (pila.empty()){
            return true;
        } else return false;
    }
}
