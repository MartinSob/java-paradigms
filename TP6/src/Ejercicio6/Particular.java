package Ejercicio6;


public class Particular extends Asistente {

    private int Descuento;


    public Particular(String nombre, String apellido, String institucion, String congreso, String Domicilio) {
        super(nombre, apellido, institucion, congreso);


        if (Domicilio.toUpperCase() == "BUENOS AIRES"){
            this.Descuento = 90;
        }

    }


}
