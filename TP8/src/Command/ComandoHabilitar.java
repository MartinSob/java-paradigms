package Command;

/**
 * Created by Sac on 26/06/2017.
 */
public class ComandoHabilitar implements Comando {

    private Empleado Emp;

    public ComandoHabilitar(Empleado Emp){
        this.Emp = Emp;
    }

    @Override
    public void Ejecutar() {
        Emp.Habilitar();
    }
}


