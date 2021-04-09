package Ejercicio6;


public abstract class Asistente {

    public int Descuento;
    private String Nombre;
    private String Apellido;
    private String Institucion;
    private String Congreso;




    public Asistente(String nombre,String apellido,String institucion, String congreso) {
        this.Apellido = apellido;
        this.Nombre = nombre;
        this.Institucion = institucion;
        this.Congreso = congreso;
    }

    public double CalcularValorEntrada(Double ValorBase){
       return  (ValorBase * this.Descuento) / 100;
    }

    public void ImprimirCredencial(Double ValorBase){
        System.out.println("Congreso: " + this.Congreso);
        System.out.println("Nombre: " + this.Nombre + "             Apellido: " + this.Apellido);
        System.out.println("Instiucion: " + this.Institucion + "             Valor de la entrada: " + CalcularValorEntrada(ValorBase) + " $");
    }



}
