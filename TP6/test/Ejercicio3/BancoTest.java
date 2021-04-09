package Ejercicio3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class BancoTest {

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
    public void crear_CuentaTest() throws Exception {
        Assert.assertTrue(bank.Cuentas.size() == 2);
        bank.crear_Cuenta("3",300,"aaa","Chubut");
        Assert.assertTrue(bank.Cuentas.size() == 3);
    }

    @Test
    public void crear_CuentaVIPTest() throws Exception {
        Assert.assertTrue(bank.Cuentas.size() == 2);
        bank.crear_CuentaVIP("4",350,"bbb","Azeroth");
        Assert.assertTrue(bank.Cuentas.size() == 3);
    }

    @Test
    public void obtener_CuentaTest() throws Exception {
        Cuenta account = bank.obtener_Cuenta("1");
        Assert.assertTrue(account.getPinHomeBanking() == "asd");

        Cuenta account2 = bank.obtener_Cuenta("2");
        Assert.assertTrue(account2.getPinHomeBanking() == "qwe");
    }

    @Test
    public void informeSaldoTest() throws Exception {
        Assert.assertTrue(bank.informeSaldo() == 250);
        bank.crear_CuentaVIP("4",350,"bbb","Azeroth");
        Assert.assertTrue(bank.informeSaldo() == 600);
    }

}