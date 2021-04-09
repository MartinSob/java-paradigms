package Ejercicio2;

public class Persona {
    String nombre = "";
    String padre = "";
    String madre = "";

    public Persona(){

    }

    public Persona(String[] linea){
        this.nombre = linea[1];
        if (linea[0].equals("PADRE")){
            this.padre = linea[2];
        } else if(linea[0].equals("MADRE")){
            this.madre = linea[2];
        }
    }

    public Persona (String nombre, String papa, String mama){
        this.nombre = nombre;
        this.padre = papa;
        this.madre = mama;
    }

    public Persona (String nombre){
        this.nombre = nombre;
    }

    public boolean Es_hermando_de(Persona persona){
        if( this.madre.equals(persona.madre) || this.padre.equals(persona.padre)){
            return true;
        } else {
            return false;
        }
    }

}
