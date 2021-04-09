package Ejercicio7.Productos.Alimentos;


public class Carnes extends ProductoAlimenticio {

    public Carnes(int precio) { super(precio); }

    @Override
    public double getPrecioVenta() {
        return this.precio*0.9;
    }

    @Override
    public String toString(){
        return "Carne: " + this.precio;
    }

    public int hashCode(){
        int result = 17;
        String name = "carne";

        result = 37 * result + name.hashCode();
        return result;
    }
}
