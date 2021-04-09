/**
 * Created by msobrero on 7/11/17.
 */
public abstract class Juego {

    Jugador player1;
    Jugador player2;

    public Juego(Jugador player1, Jugador player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void jugar() {
        Jugador ganador;

        if (calcularPuntajePlayer(player1) >= calcularPuntajePlayer(player2)) {
            ganador = player1;
        } else {
            ganador = player2;
        }

        ganador.cantDiamantes ++;
        mostrarGanador(ganador);
    }

    public abstract int calcularPuntajePlayer(Jugador player);

    public void mostrarGanador(Jugador player){
        System.out.println("Jugo " + player1.nombre + " contra " + player2.nombre + ". Gano " + player.nombre + " y la cantidad de diamantes que tiene ahora es " + player.cantDiamantes + "\n");
    }

}
