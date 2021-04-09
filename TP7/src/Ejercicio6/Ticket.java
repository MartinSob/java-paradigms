package Ejercicio6;

public class Ticket {

    public int monto;
    public String localidad;


    @Override
    public String toString() {
        return localidad + ": " + monto + " pesos";
    }

    public int getPrecio() {
        return monto;
    }

    public Ticket(Teatro.tipoLocalidad local){
        this.localidad = local.name();
        this.monto = local.getPrecio();
    }
}
