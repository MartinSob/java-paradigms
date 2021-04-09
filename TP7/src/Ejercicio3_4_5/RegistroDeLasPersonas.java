package Ejercicio3_4_5;


import java.util.ArrayList;
import java.util.Collections;

public class RegistroDeLasPersonas {

    ArrayList<Persona> personas = new ArrayList<>();


    void agregarPersona(Persona persona){
        personas.add(persona);
    }

    Persona recuperarPersona(String dni){
        for (Persona persona : personas) {
            if (persona.DNI.equals(dni)){
                return persona;
            }
        }
        return new Persona();
    }

    int cantidadPersonas(){
        return personas.size();
    }

    void imprimirListaDePersonas(){
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    void retornarPersonasOrdenadasDeMenorAMayor(){
        Collections.sort(personas);
        this.imprimirListaDePersonas();
    }



}
