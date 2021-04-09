package Ejercicio5;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Ejercicio5Test {
    @Test
    public void trasponer_matriz() throws Exception {
        ArrayList<ArrayList<Integer>> matriz1 = Ejercicio5.read_file("Matriz1");
        ArrayList<ArrayList<Integer>> matriz2 = Ejercicio5.Trasponer_matriz(matriz1);
        Ejercicio5.Escribir_archivo("Matriz2", matriz2);

        ArrayList<ArrayList<Integer>> matriz3 = Ejercicio5.read_file("Matriz2");

        Assert.assertTrue(matriz1.get(0).size() == matriz3.size());
        Assert.assertTrue(matriz1.size() == matriz3.get(0).size());
    }
}