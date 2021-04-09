package Command;


public class ComandoDeshabilitar implements Comando{

    private Empleado Emp;

    public ComandoDeshabilitar(Empleado Emp){
        this.Emp = Emp;
    }

    @Override
    public void Ejecutar() {
        Emp.Deshabilitar();
    }
}


