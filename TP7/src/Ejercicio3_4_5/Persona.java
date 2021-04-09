package Ejercicio3_4_5;


public class Persona implements Comparable<Persona> {
    String DNI;
    String nombre;
    String apellido;
    Direccion dirección;

    public Persona(String DNI, String nombre, String apellido, Direccion dirección) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dirección = dirección;
    }

    public Persona(String dni){
        this.DNI = dni;
    }

    public Persona() { }

    @Override
    public String toString(){
        return this.DNI + ": " + this.apellido + ", " + this.nombre;
    }

    @Override
    public boolean equals(Object other){
        if (this.toString().equals(other.toString())){
            return true;
        } else {
            return false;
        }
    }

    public int hashCode(){
        int result = 17;

        result = 37 * result + this.DNI.hashCode();
        return result;
    }

    @Override
    public int compareTo(Persona person) {
        return  this.DNI.compareTo(person.DNI);
    }
}
