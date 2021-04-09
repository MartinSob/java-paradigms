package Ejercicio7;

import Ejercicio7.Productos.Alimentos.Carnes;
import Ejercicio7.Productos.Alimentos.Lacteos;
import Ejercicio7.Productos.Indumentaria.Indumentaria;
import Ejercicio7.Productos.Perfumeria.Perfume_Hombre;
import Ejercicio7.Productos.Perfumeria.Perfume_Mujer;
import Ejercicio7.Productos.Producto;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class CajaTest {
    @Test
    public void facturarTest() throws Exception {

        Caja caja1 = new Caja();

        Chango chango1 = new Chango();
        chango1.productos.add(new Perfume_Hombre(100)); // 100
        chango1.productos.add(new Perfume_Hombre(100)); // 30
        chango1.productos.add(new Perfume_Hombre(100)); // 100
        chango1.productos.add(new Perfume_Hombre(100)); // 30
        chango1.productos.add(new Indumentaria(200)); // 200
        chango1.productos.add(new Indumentaria(200)); // 60
        chango1.productos.add(new Carnes(1000)); // 900

        Assert.assertTrue(caja1.facturar(chango1) == 1420);

        chango1.productos.add(new Carnes(1000)); // 270
        Assert.assertTrue(caja1.facturar(chango1) == 1690);
    }

}