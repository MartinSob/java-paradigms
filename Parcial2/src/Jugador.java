/**
 * Created by msobrero on 7/11/17.
 */
public class Jugador {

    public String nombre;
    public int cantDiamantes = 0;
    public int cantPuntos;

    public Jugador() {

    }

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "Nombre: " + this.nombre + ", Puntos: " + this.cantPuntos + ", Diam: " + this.cantDiamantes + "\n";
    }

}
