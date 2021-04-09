package Ejercicio7.Productos.Perfumeria;


public class Perfume_Hombre extends Perfumeria{

    public Perfume_Hombre(int precio) { super(precio); }

    @Override
    public double getPrecioVenta() {
        return precio;
    }

    @Override
    public String toString(){
        return "Perfume_Hombre: " + this.precio;
    }

    public int hashCode(){
        int result = 17;
        String name = "perf_hombre";

        result = 37 * result + name.hashCode();
        return result;
    }
}
