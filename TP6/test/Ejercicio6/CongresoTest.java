package Ejercicio6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CongresoTest {


    @Test
    public void agregar() throws Exception {
        Congreso congreso = new Congreso(300, "IT EXPO");
        Asistente Nuevo = new Alumno("Martin", "Sobrero", "UAI", congreso.Nombre, 3);

        congreso.Agregar(Nuevo);

        for (Asistente a: congreso.Lista) {
            a.ImprimirCredencial(congreso.ValorBase);
        }

    }

}