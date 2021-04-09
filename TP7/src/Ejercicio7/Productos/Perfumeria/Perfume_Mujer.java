package Ejercicio7.Productos.Perfumeria;



public class Perfume_Mujer extends Perfumeria{

    public Perfume_Mujer(int precio) { super(precio); }

    @Override
    public double getPrecioVenta() {
        return precio;
    }

    @Override
    public String toString(){
        return "Perfume_Mujer: " + this.precio;
    }

    public int hashCode(){
        int result = 17;
        String name = "perf_mujer";

        result = 37 * result + name.hashCode();
        return result;
    }
}
