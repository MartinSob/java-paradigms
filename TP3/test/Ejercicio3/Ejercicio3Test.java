package Ejercicio3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ejercicio3Test {
    @Test
    public void isValidEmail() throws Exception {
        Assert.assertTrue(new Ejercicio3().isValidEmail("test@gmail.com"));
        Assert.assertTrue(new Ejercicio3().isValidEmail("test.test@gmail.com"));
        Assert.assertTrue(new Ejercicio3().isValidEmail("test_test@gmail.com"));
        Assert.assertFalse(new Ejercicio3().isValidEmail("test_test@gmail_com"));
        Assert.assertFalse(new Ejercicio3().isValidEmail("test_testAgmail.com"));
    }

    @Test
    public void validatePhoneNumber() throws Exception {
        Assert.assertTrue(new Ejercicio3().validateDate("27/02/1996"));
        Assert.assertTrue(new Ejercicio3().validateDate("25/05/1810"));
        Assert.assertFalse(new Ejercicio3().validateDate("45/02/1996"));
        Assert.assertFalse(new Ejercicio3().validateDate("27/15/1996"));

    }

}