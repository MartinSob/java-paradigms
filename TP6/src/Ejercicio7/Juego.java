package Ejercicio7;


import java.util.ArrayList;
import java.util.Random;

public class Juego {
    static public ArrayList<Jugador> jugadores = new ArrayList<>();

    static public void agregarJugador(Jugador player){
        jugadores.add(player);
    }

    static public void borrarJugador(Jugador player){
        jugadores.remove(player);
    }

    static public void Jugar(){
        Random random = new Random();
        int i = 1;
        while (jugadores.size() > 1) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int time = random.nextInt(20) + 1;
            int player = random.nextInt(jugadores.size());
            System.out.println("Ronda " + i++ + ": La musica sono por " + time + " segundos y perdio " + jugadores.get(player).nombre);
            borrarJugador(jugadores.get(player));
        }
        System.out.println("El ganador es: " + jugadores.get(0).nombre);
    }

}
