import java.util.Random;

/**
 * Created by msobrero on 7/11/17.
 */
public class LosImpares extends Juego {


    public LosImpares(Jugador player1, Jugador player2) {
        super(player1, player2);
    }

    @Override
    public int calcularPuntajePlayer(Jugador player) {
        int sumaNrosImpares = 0;

        Random randomGenerator = new Random();

        for (int i = 0 ; i<10 ; i++){

            // Porque nextInt genera de 0 al parametro => le sumo 1
            int randomInt = randomGenerator.nextInt(9) + 1;
            if (randomInt % 2 != 0) {
                sumaNrosImpares += randomInt;
            }
        }

        player.cantPuntos += sumaNrosImpares;
        return sumaNrosImpares;
    }
}
