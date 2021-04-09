import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class Eje1Test {
    @Test
    public void combinaciones() throws Exception {
        ArrayList<String> array_Final = new ArrayList<String>();
        Eje1.Combinaciones(3,"",3, array_Final);

        ArrayList<String> array_OK = new ArrayList<>();
        array_OK.add("123");
        array_OK.add("132");
        array_OK.add("213");
        array_OK.add("231");
        array_OK.add("312");
        array_OK.add("321");


        for (int i = 0; i < 6; i++){
            Assert.assertTrue(array_Final.get(i).equals(array_OK.get(i)));
        }

    }

}