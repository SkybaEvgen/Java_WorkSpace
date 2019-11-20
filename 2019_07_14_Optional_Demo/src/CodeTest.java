import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CodeTest {

    @Test
    public void testGetLength(){

        String testInput = "Hello";

        int length = Code.getLength(testInput);

        assertEquals(15, length);
    }

    @Test(expected = NullPointerException.class)
    public void testGetLengthForNull(){

        String testInput = null;

        int length = Code.getLength(testInput);
    }
}
