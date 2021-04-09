package Ejercicio3;


public class Cuenta {

    private String nroCuenta;
    private int saldo;
    private String pinHomeBanking;
    private String residencia;

    protected int costo = 6;

    public Cuenta(){}

    public Cuenta(String nro, String pin){
        this.nroCuenta = nro;
        this.pinHomeBanking = pin;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public int getSaldo(){
        return this.saldo;
    }

    public Cuenta(String nro, int newSaldo, String pin, String res){
        this.nroCuenta = nro;
        this.saldo = newSaldo;
        this.pinHomeBanking = pin;
        this.residencia = res;
    }

    public void depositar(int cash){
        this.saldo -= costo;
        this.saldo += cash;
    }

    public boolean extraer(int cash){
        if (this.saldo-costo > cash){
            this.saldo -= cash + costo;
            return true;
        } else {
            return false;
        }
    }

    public int consultarSaldo(){
        this.saldo -= costo;
        return this.saldo;
    }

    public String getPinHomeBanking() {
        return pinHomeBanking;
    }

    public void setPinHomeBanking(String pinHomeBanking) {
        this.saldo -= costo;
        this.pinHomeBanking = pinHomeBanking;
    }
}
