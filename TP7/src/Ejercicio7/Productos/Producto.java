package Ejercicio7.Productos;


public abstract class Producto implements ProductoDeVenta {

    protected int precio;
    public String nombre;

    @Override
    public boolean equals(Object other){
        if (this.toString().equals(other.toString())){
            return true;
        } else {
            return false;
        }
    }

}
