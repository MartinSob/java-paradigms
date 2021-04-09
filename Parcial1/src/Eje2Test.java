import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by msobrero on 5/9/17.
 */
public class Eje2Test {
    @Test
    public void secuencia_GenomicaTest() throws Exception {
        String result = Eje2.secuencia_Genomica("ACCGTACCGTACCT", 3);

        Assert.assertTrue(result.equals("ACC"));

        String result2 = Eje2.secuencia_Genomica("AccGTACCGTACCT", 3);

        Assert.assertTrue(result2.equals("ACC"));

        String result3 = Eje2.secuencia_Genomica("ACCAAA", 3);

        Assert.assertTrue(result3.equals("AAA"));
    }

}