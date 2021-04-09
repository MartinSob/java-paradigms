package Ejercicio3;


import java.util.ArrayList;

public class Banco {

    ArrayList<Cuenta> Cuentas = new ArrayList<Cuenta>();


    public void crear_Cuenta(String nro, int newSaldo, String pin, String res){
        res = res.toUpperCase();
        Cuentas.add(new Cuenta(nro, newSaldo, pin, res));
    }

    public void crear_CuentaVIP(String nro, int newSaldo, String pin, String res){
        res = res.toUpperCase();
        Cuentas.add(new CuentaVIP(nro, newSaldo, pin, res));
    }

    public Cuenta obtener_Cuenta(String nro){
        for (Cuenta cuenta: Cuentas) {
            if (cuenta.getNroCuenta() == nro){
                return cuenta;
            }
        }
        return new Cuenta();
    }

    public int informeSaldo(){
        int saldoTot = 0;
        for (Cuenta cuenta : Cuentas){
            saldoTot += cuenta.getSaldo();
        }
        return saldoTot;
    }

}
