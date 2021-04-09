package Ejercicio8;
import Utilidades.Utilidades;


public class Caracol {
    int sube;
    int resbala;

    public Caracol (){
        System.out.println("Sube: ");
        this.sube = new Utilidades().get_int_console();
        System.out.println("Resbala: ");
        this.resbala = new Utilidades().get_int_console();
    }

    public Caracol (int sube, int resbala){
        this.sube = sube;
        this.resbala = resbala;
    }

    public int calcular_dias(int profundidad){
        int dias = 0;

        while (profundidad > 0){
            dias ++;
            profundidad = profundidad - this.sube;
            if (profundidad <= 0){
                return dias;
            } else {
                profundidad += this.resbala;
            }
        }

        return dias;
    }

}
