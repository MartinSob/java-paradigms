package Ejercicio7.Productos.Indumentaria;


import Ejercicio7.Productos.Producto;

public class Indumentaria extends Producto {

    String marca;
    int talle;

    public Indumentaria(int p){
        super.precio = p;
    }

    @Override
    public double getPrecioVenta() {
        return this.precio;
    }

    @Override
    public String toString(){
        return "Ropa: " + this.precio + ", Marca: " + this.marca + ", Talle: " + this.talle;
    }

    @Override
    public boolean equals(Object other){
        if (this.toString().equals(other.toString())){
            return true;
        } else {
            return false;
        }
    }

    public int hashCode(){
        int result = 17;
        String name = "indumentaria";

        result = 37 * result + name.hashCode();
        return result;
    }
}
