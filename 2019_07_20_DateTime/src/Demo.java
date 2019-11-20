import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {

        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();

        LocalDate now = LocalDate.now();
        LocalDate now5 = now.plusDays(5);

        Period between = Period.between(now, now5);
        System.out.println(between.getDays());

        LocalTime time1 = LocalTime.now();
        LocalTime time2 = time1.plusHours(12);

        long between1 = ChronoUnit.HOURS.between(time1, time2);
        System.out.println(between1);
    }

    /*public static List<String> reformatDates(List<String> inputDates){

        DateTimeFormatter formatterIn = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        inputDates.stream().map(s -> LocalDate.parse(s, formatterIn))
    }*/
}
