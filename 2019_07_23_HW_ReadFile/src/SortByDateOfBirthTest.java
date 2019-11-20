import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class SortByDateOfBirthTest {

    @Test
    public void test() throws IOException {
        List<String> expected = Arrays.asList(
                "[Лев Щербина,  07 10 1945]",
                "[Лесь Подервянский,  03 11 1952]",
                "[Иван Макаревич,  03 04 1973]",
                "[Николай Дуров,  16 01 1996]",
                "[Алексей Толстой,  23 12 2001]");
        List<String> actual = SortByDateOfBirth.sortByDateOfBirth();
        Assert.assertEquals(expected,actual);
    }
}
