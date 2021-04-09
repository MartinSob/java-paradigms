package Ejercicio7;

import Ejercicio7.Productos.Alimentos.Carnes;
import Ejercicio7.Productos.Alimentos.Lacteos;
import Ejercicio7.Productos.Indumentaria.Indumentaria;
import Ejercicio7.Productos.Perfumeria.Perfume_Hombre;
import Ejercicio7.Productos.Perfumeria.Perfume_Mujer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class SupermercadoTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void liquidaciónDelDiaTest() throws Exception {
        Supermercado s1 = new Supermercado();

        Caja caja1 = new Caja();
        Caja caja2 = new Caja();

        Chango chango1 = new Chango();
        chango1.productos.add(new Perfume_Hombre(100));
        chango1.productos.add(new Indumentaria(200));
        chango1.productos.add(new Carnes(1000)); // 900

        caja1.facturar(chango1);

        Chango chango2 = new Chango();
        chango2.productos.add(new Perfume_Mujer(100));
        chango2.productos.add(new Indumentaria(200));
        chango2.productos.add(new Lacteos(1000)); // 800

        caja1.facturar(chango2);
        caja2.facturar(chango2);

        s1.cajas.add(caja1);

        Assert.assertTrue(s1.liquidaciónDelDia() == 2300);

        s1.cajas.add(caja2);

        Assert.assertTrue(s1.liquidaciónDelDia() == 3400);

        // Con el descuento "segundo al 70"
        Chango chango3 = new Chango();
        chango3.productos.add(new Perfume_Hombre(100)); // 100
        chango3.productos.add(new Perfume_Hombre(100)); // 30
        chango3.productos.add(new Perfume_Hombre(100)); // 100
        chango3.productos.add(new Perfume_Hombre(100)); // 30
        chango3.productos.add(new Indumentaria(200)); // 200
        chango3.productos.add(new Indumentaria(200)); // 60
        chango3.productos.add(new Carnes(1000)); // 900 => Total: 1420

        caja1.facturar(chango3);
        Assert.assertTrue(s1.liquidaciónDelDia() == 4820);

    }

}