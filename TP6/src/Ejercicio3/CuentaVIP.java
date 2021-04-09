package Ejercicio3;


public class CuentaVIP extends Cuenta{

    public CuentaVIP(String nro, int newSaldo, String pin, String res){
        super(nro, newSaldo, pin, res);
        if (res.equals("CAPITAL")){
            this.costo = 2;
        } else {
            this.costo = 0;
        }
    }

}
