package Ejercicio3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CuentaTest {

    Banco bank;

    @Before
    public void setUp() throws Exception {
        bank = new Banco();
        bank.crear_Cuenta("1",100,"asd","Capital");
        bank.crear_Cuenta("2",150,"qwe","Capital");
    }

    @After
    public void tearDown() throws Exception {
        bank = null;
    }

    @Test
    public void depositarTest() throws Exception {
        Cuenta account = bank.obtener_Cuenta("1");
        account.depositar(50);
        Assert.assertTrue(account.consultarSaldo() == 150 - (2 * account.costo));
    }

    @Test
    public void extraerTest() throws Exception {
        Cuenta account = bank.obtener_Cuenta("1");
        account.extraer(50);
        Assert.assertTrue(account.consultarSaldo() == 50 - (2 * account.costo));
    }

    @Test
    public void consultarSaldoTest() throws Exception {
        Cuenta account = bank.obtener_Cuenta("1");
        Assert.assertTrue(account.consultarSaldo() == 100 - account.costo);

        Cuenta account2 = bank.obtener_Cuenta("2");
        Assert.assertTrue(account2.consultarSaldo() == 150 - account2.costo);
    }

    @Test
    public void setPinHomeBankingTest() throws Exception {
        Cuenta account = bank.obtener_Cuenta("1");
        account.setPinHomeBanking("hola");
        Assert.assertTrue(account.getPinHomeBanking().equals("hola"));
    }

}