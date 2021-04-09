package Ejercicio7;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class JuegoTest {
    @Test
    public void jugar() throws Exception {
        Juego.agregarJugador(new Jugador("Sheldon Cooper"));
        Juego.agregarJugador(new Jugador("Leonard Hofstdater"));
        Juego.agregarJugador(new Jugador("Howard Wolowitz"));
        Juego.agregarJugador(new Jugador("Raj Koothrapali"));
        Juego.agregarJugador(new Jugador("Penny"));
        Juego.agregarJugador(new Jugador("Bernadette"));
        Juego.agregarJugador(new Jugador("Amy"));

        Juego.Jugar();

        Assert.assertTrue(Juego.jugadores.size() == 1);
    }

}