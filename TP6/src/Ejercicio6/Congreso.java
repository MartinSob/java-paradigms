package Ejercicio6;

import java.util.ArrayList;

/**
 * Created by Sac on 30/06/2017.
 */
public class Congreso {
    public double ValorBase;
    public String Nombre;

    public ArrayList<Asistente> Lista = new ArrayList<Asistente>();

    public void Agregar(Asistente asistente){
        Lista.add(asistente);
    }

    public Congreso(int ValorBase, String Nombre){
        this.ValorBase = ValorBase;
        this.Nombre = Nombre;
    }
}
