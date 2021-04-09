import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by msobrero on 7/11/17.
 */
public class SalaDeJuegosTest {

    SalaDeJuegos salaDeJuegos;

    @Before
    public void setUp() throws Exception {
        salaDeJuegos = new SalaDeJuegos();

    }


    @Test
    public void jugarTest() throws Exception {
        // PARTE 1
        Jugador j1 = new Jugador("Adrian");
        Jugador j2 = new Jugador("Andres");

        salaDeJuegos.jugadores.add(j1);
        salaDeJuegos.jugadores.add(j2);

        Lejanos6 lejano6_1 = new Lejanos6(j1,j2);

        salaDeJuegos.agregarJuego(lejano6_1);

        for (int i = 0 ; i<5 ; i++){
            lejano6_1.jugar();
        }

        // PARTE 2
        Jugador j3 = new Jugador("Adriana");
        Jugador j4 = new Jugador("Ana");

        salaDeJuegos.jugadores.add(j3);
        salaDeJuegos.jugadores.add(j4);

        Lejanos6 lejano6_2 = new Lejanos6(j3,j4);

        salaDeJuegos.agregarJuego(lejano6_2);

        for (int i = 0 ; i<6 ; i++){
            lejano6_2.jugar();
        }

        // PARTE 3
        Jugador j5 = new Jugador("Carlos");
        Jugador j6 = new Jugador("Cesar");

        salaDeJuegos.jugadores.add(j5);
        salaDeJuegos.jugadores.add(j6);

        ElMenor elMenor_1 = new ElMenor(j5,j6);

        salaDeJuegos.agregarJuego(elMenor_1);

        for (int i = 0 ; i<3 ; i++){
            elMenor_1.jugar();
        }

        // PARTE 4
        Jugador j7 = new Jugador("Damian");
        Jugador j8 = new Jugador("Demian");

        salaDeJuegos.jugadores.add(j7);
        salaDeJuegos.jugadores.add(j8);

        ElMenor elMenor_2 = new ElMenor(j7,j8);

        salaDeJuegos.agregarJuego(elMenor_2);

        for (int i = 0 ; i<3 ; i++){
            elMenor_2.jugar();
        }

        // PARTE 5
        Jugador j9 = new Jugador("Gustavo");
        Jugador j10 = new Jugador("Gerardo");

        salaDeJuegos.jugadores.add(j9);
        salaDeJuegos.jugadores.add(j10);

        LosImpares losImpares_1 = new LosImpares(j9,j10);

        salaDeJuegos.agregarJuego(losImpares_1);

        for (int i = 0 ; i<10 ; i++){
            losImpares_1.jugar();
        }

        // PARTE 6
        Jugador j11 = new Jugador("Marian");
        Jugador j12 = new Jugador("Maria");

        salaDeJuegos.jugadores.add(j11);
        salaDeJuegos.jugadores.add(j12);

        LosImpares losImpares_2 = new LosImpares(j11,j12);

        salaDeJuegos.agregarJuego(losImpares_2);

        for (int i = 0 ; i<15 ; i++){
            losImpares_2.jugar();
        }

        // PARTE 7
        Jugador j13 = new Jugador("Norma");
        Jugador j14 = new Jugador("Nancy");

        salaDeJuegos.jugadores.add(j13);
        salaDeJuegos.jugadores.add(j14);

        LosImpares losImpares_3 = new LosImpares(j13,j14);

        salaDeJuegos.agregarJuego(losImpares_3);

        for (int i = 0 ; i<15 ; i++){
            losImpares_3.jugar();
        }

        // PARTE FINAL
        System.out.println(salaDeJuegos.jugadorConMasDiamantes());
    }

}