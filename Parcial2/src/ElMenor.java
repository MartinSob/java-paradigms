import java.util.Random;

/**
 * Created by msobrero on 7/11/17.
 */
public class ElMenor extends Juego {


    public ElMenor(Jugador player1, Jugador player2) {
        super(player1, player2);
    }

    @Override
    public int calcularPuntajePlayer(Jugador player) {

        int elMenor = 10;

        Random randomGenerator = new Random();

        for (int i = 0 ; i<10 ; i++){

            // Porque nextInt genera de 0 al parametro => le sumo 1
            int randomInt = randomGenerator.nextInt(9) + 1;
            if (randomInt < elMenor) {
                elMenor = randomInt;
            }
        }

        player.cantPuntos += elMenor;
        return elMenor;
    }

}
