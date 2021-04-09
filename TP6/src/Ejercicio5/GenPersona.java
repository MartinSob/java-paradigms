package Ejercicio5;


public class GenPersona {
    public int Id;
    public String Nucleotico;
    public Gen gen;
    public GenPersona(Gen gen, String valor){
        this.Id = gen.Id;
        this.Nucleotico = valor;
        this.gen = gen;


    }
}
