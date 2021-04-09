package Command;


import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        Jefe Jefe = new Jefe();
        Empleado Empleado = new Empleado();
        Comando Habilitar = new ComandoHabilitar(Empleado);
        Comando Deshabilitar = new ComandoDeshabilitar(Empleado);

        System.out.println("¿El empleado debe estar habilitado?");
        Scanner SC = new Scanner(System.in);
        String Respesta = SC.next();


        switch (Respesta.toUpperCase()) {
            case "SI": Jefe.Habilitacion(Habilitar); break;
            case "NO": Jefe.Habilitacion(Deshabilitar); break;
            default: System.out.println("Respuesta no valida"); break;

        }

    }

}

