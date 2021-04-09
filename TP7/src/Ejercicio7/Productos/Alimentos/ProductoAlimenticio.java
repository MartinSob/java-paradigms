package Ejercicio7.Productos.Alimentos;


import Ejercicio7.Productos.Producto;

public abstract class ProductoAlimenticio extends Producto {

    public ProductoAlimenticio(int precio){
        this.precio = precio;
    }

    @Override
    public boolean equals(Object other){
        if (this.toString().equals(other.toString())){
            return true;
        } else {
            return false;
        }
    }

}
