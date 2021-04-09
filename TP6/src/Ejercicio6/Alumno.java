package Ejercicio6;


public class Alumno extends Asistente {

    private int Descuento;


    public Alumno(String nombre, String apellido, String institucion, String congreso, int Año) {
        super(nombre, apellido, institucion, congreso);


        if (Año >= 1 && Año <= 3){
            super.Descuento = 75;
        }

    }


}
