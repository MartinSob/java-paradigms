package Ejercicio7.Productos.Alimentos;


public class Lacteos extends ProductoAlimenticio {

    public Lacteos(int precio) { super(precio); }

    @Override
    public double getPrecioVenta() {
        return precio*0.8;
    }

    @Override
    public String toString(){
        return "Lacteo: " + this.precio;
    }

    public int hashCode(){
        int result = 17;
        String name = "lacteo";

        result = 37 * result + name.hashCode();
        return result;
    }
}
