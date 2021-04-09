package Ejercicio3_4_5;


public class Ejercicio3 {

    public static void main(String[] args){
        Persona juan = new Persona("29888111");
        juan.nombre = "Juan";
        juan.apellido = "Perez";
        System.out.println(juan);

        // EJERCICIO 3
        // Antes:   'Ejercicio3.Persona@60e53b93'
        // Despues: '29888111: Perez, Juan'

        // EJERCICIO 4
        testIgualdad();
    }

    // EJERCICIO 4
    private static void testIgualdad(){
        System.out.println(new Persona("29888111") == new Persona("29888111")); // false
        System.out.println(new Persona("29888111").equals(new Persona("29888111"))); // true si se sobreescribe equals()
    }

}
