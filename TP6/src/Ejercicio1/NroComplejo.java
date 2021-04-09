package Ejercicio1;


import java.text.DecimalFormat;

public class NroComplejo {

    private float nroReal;
    private float nroImaginario;

    //region Constructors-Getters-Setters

    public NroComplejo() {}

    public NroComplejo(float nroReal, float nroImaginario) {
        this.nroReal = nroReal;
        this.nroImaginario = nroImaginario;
    }

    public float getNroReal() {
        return nroReal;
    }

    public void setNroReal(float nroReal) {
        this.nroReal = nroReal;
    }

    public float getNroImaginario() {
        return nroImaginario;
    }

    public void setNroImaginario(float nroImaginario) {
        this.nroImaginario = nroImaginario;
    }

    //endregion

    public void sumar(NroComplejo nro){
        this.nroReal += nro.getNroReal();
        this.nroImaginario += nro.getNroImaginario();
        emprolijarNros();
    }

    public void restar(NroComplejo nro){
        this.nroReal -= nro.getNroReal();
        this.nroImaginario -= nro.getNroImaginario();
        emprolijarNros();
    }

    public boolean equals(NroComplejo nro) {
        if (this.nroReal == nro.nroReal && this.nroImaginario == nroImaginario){
            return true;
        } else {
            return false;
        }
    }

    public void emprolijarNros(){
        this.nroReal = Float.parseFloat(new DecimalFormat("##.##").format(this.nroReal));
        this.nroImaginario = Float.parseFloat(new DecimalFormat("##.##").format(this.nroImaginario));
    }
}
