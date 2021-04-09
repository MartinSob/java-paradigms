package Ejercicio7.Productos.Alimentos;


public class Enlatados extends ProductoAlimenticio {

    public Enlatados(int precio){
        super(precio);
    }

    @Override
    public double getPrecioVenta() {
        return precio;
    }

    @Override
    public String toString(){
        return "Enlatado: " + this.precio;
    }

    public int hashCode(){
        int result = 17;
        String name = "enlatado";

        result = 37 * result + name.hashCode();
        return result;
    }
}
