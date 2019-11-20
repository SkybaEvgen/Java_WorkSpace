import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class DateReformateTast {

    @Test
    public void testDateReformat(){
        List<String> inputDates = Arrays.asList(
                "2019-07-20",
                "2019-05-18",
                "2019-08-09");
        List<String> expected = Arrays.asList(
                "20 July, 2019 Saturday",
                "18 May, 2019 Saturday",
                "09 August, 2019 Friday");
        List<String> actual = DateTime.reformateDates(inputDates);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testDateReformatSorted(){
        List<String> inputDates = Arrays.asList(
                "2019-07-20",
                "2019-05-18",
                "2019-08-09");
        List<String> expected = Arrays.asList(
                "18 May, 2019 Saturday",
                "20 July, 2019 Saturday",
                "09 August, 2019 Friday");
        List<String> actual = DateTime.reformateAndSortDates(inputDates);
        Assert.assertEquals(expected,actual);
    }

}
