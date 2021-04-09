package Ejercicio4;


import java.util.ArrayList;

public class CM {

    static ArrayList<Contacto> contactos = new ArrayList<>();
    static ArrayList<Grupo> grupos = new ArrayList<>();

    public static void crearContacto(String name, String lastname, String phone, String email){
        Contacto contact = new Contacto(name, lastname, phone, email);
        contactos.add(contact);
    }

    public static void modificarContacto(Contacto contact, String name, String lastname, String phone, String email){
        contact.nombre = name;
        contact.apellido = lastname;
        contact.telefono = phone;
        contact.email = email;
    }

    public static void borrarContacto(Contacto contact){
        for (Grupo group : grupos) {
            if (group.contactos.contains(contact)){
                group.sacarContacto(contact);
            }
        }
        contactos.remove(contact);
    }

    public static void sacarContactoGrupo(Contacto contact, Grupo group) {
        group.sacarContacto(contact);
    }

    public static void agregarContactoGrupo(Contacto contact, Grupo group) {
        group.agregarContacto(contact);
    }

}
