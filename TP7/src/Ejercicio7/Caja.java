package Ejercicio7;


import Ejercicio7.Productos.Producto;
import java.util.ArrayList;


public class Caja extends Supermercado{

    double totalDia = 0;

    public double facturar(Chango chango){

        ArrayList<Chango.ProdCantidad> productos = chango.obtenerProdCantidad();

        double total = descuento70offEnLaSegunda(productos);

        totalDia += total;
        return total;
    }

    double descuento70offEnLaSegunda(ArrayList<Chango.ProdCantidad> productos) {
        double total = 0;

        for (Chango.ProdCantidad prodCant : productos) {
            if (prodCant.getCantidad() < 2 ){
                total += prodCant.producto.getPrecioVenta();
            } else {
                int cantidad = prodCant.getCantidad() / 2;
                total += prodCant.producto.getPrecioVenta() * cantidad + prodCant.producto.getPrecioVenta() * cantidad * 0.3;
                total +=  (prodCant.getCantidad() % 2) * prodCant.producto.getPrecioVenta();
            }
        }

        return total;
    }

}
