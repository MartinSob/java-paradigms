package Ejercicio6;


import java.util.ArrayList;

public class Teatro {

    public ArrayList<Ticket> tickets = new ArrayList<>();


    public enum tipoLocalidad {
        Adelante (5), Medio (15), Atras (30);

        private int precio;

        tipoLocalidad(int value) {
            this.precio = value;
        }

        public int getPrecio() {
            return this.precio;
        }

        @Override
        public String toString() {
            return this.name() + "(" + this.precio + ")";
        }
    }

    public int getPrecioEnDolares(tipoLocalidad locality) {
        return locality.getPrecio()*16;
    }

    public int getPrecioEnEuros(tipoLocalidad locality) {
        return locality.getPrecio()*18;
    }

    public void AgregarTicket(Ticket tick){
        tickets.add(tick);
    }

    public void imprimirLocalidades() {
        for (tipoLocalidad localidad : tipoLocalidad.values()) {
            System.out.println("Localidad: " + localidad + " - Precio: " + localidad.getPrecio());
        }
    }

}
