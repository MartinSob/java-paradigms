import java.util.ArrayList;

/**
 * Created by msobrero on 7/11/17.
 */
public class SalaDeJuegos {

    public ArrayList<Juego> juegos = new ArrayList<Juego>();
    public ArrayList<Jugador> jugadores = new ArrayList<>();

    public Jugador jugadorConMasDiamantes(){
        Jugador maxJugador = jugadores.get(0);
        for (Jugador player : jugadores) {
            if (player.cantDiamantes > maxJugador.cantDiamantes) {
                maxJugador = player;
            }
        }

        return maxJugador;
    }

    public Jugador jugadorConMenosPuntos(){
        Jugador minJugador = jugadores.get(0);
        for (Jugador player : jugadores) {
            if (player.cantPuntos < minJugador.cantPuntos) {
                minJugador = player;
            }
        }

        return minJugador;
    }

    public void agregarJuego(Juego game) {
        juegos.add(game);

    }

}
