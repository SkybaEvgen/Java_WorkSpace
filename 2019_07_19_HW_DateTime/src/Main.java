import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listDate = Arrays.asList("2014-08-13", "2018-04-15", "2017-12-30");

        System.out.println(ReformatDate.reformatDates(listDate));
    }
}
