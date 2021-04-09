import java.util.Random;

/**
 * Created by msobrero on 7/11/17.
 */
public class Lejanos6 extends Juego {

    public Lejanos6(Jugador player1, Jugador player2) {
        super(player1, player2);
    }

    @Override
    public int calcularPuntajePlayer(Jugador player) {

        int sumaDiferencias = 0;

        Random randomGenerator = new Random();

        for (int i = 0 ; i<10 ; i++){

            // Porque nextInt genera de 0 al parametro => le sumo 1
            int randomInt = randomGenerator.nextInt(9) + 1;
            sumaDiferencias += (6 - Math.abs(randomInt));

        }

        player.cantPuntos += sumaDiferencias;
        return sumaDiferencias;
    }

}
