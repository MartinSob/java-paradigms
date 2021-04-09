package Ejercicio7;

import Ejercicio7.Productos.Producto;
import Ejercicio7.Productos.ProductoDeVenta;

import java.util.ArrayList;
import java.util.Collections;


public class Chango {
    ArrayList<Producto> productos = new ArrayList<>();

    public ArrayList<ProdCantidad> obtenerProdCantidad(){
        ArrayList<ProdCantidad> auxProductos = new ArrayList<>();

        for (Producto prod : productos) {
            ProdCantidad pc = new ProdCantidad(prod);
            if (!existProdInList(prod, auxProductos)){
                auxProductos.add(pc);
            } else {
                auxProductos.get(getIndexProducto(prod,auxProductos)).incrementarCantidad();
            }
        }

        return auxProductos;
    }

    boolean existProdInList(Producto prod, ArrayList<ProdCantidad> auxProductos){
        for (ProdCantidad producto : auxProductos) {
            if (prod.equals(producto.producto)){
                return true;
            }
        }
        return false;
    }

    int getIndexProducto(Producto producto, ArrayList<ProdCantidad> productos){
        int i = 0;
        for (ProdCantidad prod : productos) {
            if (prod.producto.equals(producto)){
                return i;
            }
            i++;
        }

        return 0;
    }

    public class ProdCantidad {
        Producto producto;
        private int cantidad;

        public ProdCantidad(Producto prod){
            this.producto = prod;
            this.cantidad = 1;
        }

        public void incrementarCantidad(){
            this.cantidad++;
        }

        public int getCantidad(){
            return this.cantidad;
        }

    }
}
