package Command;

/*Receptor*/

public class Empleado {

    private boolean Ingreso;

    public void Habilitar(){
        Ingreso = true;
        System.out.println("El Empleado esta habilitado");
    }

    public void Deshabilitar(){
        Ingreso = false;
        System.out.println("El Empleado esta deshabilitado");
    }
}


