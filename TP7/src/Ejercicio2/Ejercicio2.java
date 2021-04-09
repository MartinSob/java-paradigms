package Ejercicio2;


import java.util.ArrayList;
import java.util.TreeSet;

public class Ejercicio2 {

    public static void main(String[] args){
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(1);
        set.add(1);
        set.add(3);

        System.out.println(set.size()); // 2
        System.out.println(set); // [1, 3]

        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        arraylist.add(1);
        arraylist.add(1);
        arraylist.add(3);
        System.out.println(arraylist.size()); // 3
        System.out.println(arraylist); // [1, 1, 3]
    }
}
