package Ejercicio4;


import java.util.ArrayList;

public class Grupo {

    private String nombre;
    public ArrayList<Contacto> contactos;

    public Grupo() { }

    public Grupo(String nombre) {
        this.nombre = nombre;
        contactos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarContacto(Contacto contact){
        contactos.add(contact);
    }

    public void sacarContacto(Contacto contact){
        if (contactos.contains(contact)) {
            contactos.remove(contact);
        }
    }

}
