import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

public class DateTime {

    public static void main(String[] args) {
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
//        allZoneIds.forEach(System.out::println);

        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Europe/Berlin"));
        System.out.println(zonedDateTime);
    }



    //input date  -> yyyy-MM-dd
    //output date -> dd MMMM, yyyy EEEE

    public static List<String> reformateDates(List<String> inputDates){

        DateTimeFormatter formatterIn = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatterOut = DateTimeFormatter.ofPattern("dd MMMM, yyyy EEEE", Locale.ENGLISH);
        List<String> formattedDates = inputDates
                .stream()
                .map(s -> LocalDate.parse(s, formatterIn))
                .map(formatterOut::format)
                .collect(Collectors.toList());


        return formattedDates;

    }

    public static List<String> reformateAndSortDates(List<String> inputDates){

        DateTimeFormatter formatterIn = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatterOut = DateTimeFormatter.ofPattern("dd MMMM, yyyy EEEE", Locale.ENGLISH);
        List<String> formattedDates = inputDates
                .stream()
                .map(s -> LocalDate.parse(s, formatterIn))
                .sorted()
                .map(formatterOut::format)
                .collect(Collectors.toList());


        return formattedDates;

    }
}
