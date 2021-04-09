package Ejercicio7.Productos.Perfumeria;


import Ejercicio7.Productos.Producto;

public abstract class Perfumeria extends Producto {

    String nombre;

    public Perfumeria(int precio) { this.precio = precio; }

    @Override
    public boolean equals(Object other){
        if (this.toString().equals(other.toString())){
            return true;
        } else {
            return false;
        }
    }

}
