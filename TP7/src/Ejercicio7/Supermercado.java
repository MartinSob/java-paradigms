package Ejercicio7;


import java.util.ArrayList;

public class Supermercado {

    ArrayList<Caja> cajas = new ArrayList<>();

    double liquidaciónDelDia(){
        double total = 0;
        for (Caja caja : cajas) {
            total += caja.totalDia;
        }
        return total;
    }

}
