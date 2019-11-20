import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Demo {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        System.out.println(now);

        LocalDate date1 = LocalDate.of(2016, 02,20);
        System.out.println(date1);

        LocalDate localDate = date1.plusDays(10);
        System.out.println(localDate);

        LocalDate minus = date1.minus(10, ChronoUnit.YEARS);
        System.out.println(minus);
        LocalDate plus = date1.plus(14, ChronoUnit.DAYS);
        System.out.println(plus);

        LocalDate before = LocalDate.now();
        LocalDate after = LocalDate.now().plusDays(5);
        System.out.println(before.isBefore(after));

        LocalDateTime plus1 = LocalDateTime.now().plus(125, ChronoUnit.SECONDS);
        System.out.println(plus1);

        LocalDate parse = LocalDate.parse("12-06-2016", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(parse);

        LocalDate parse1 = LocalDate.now();
        String format = parse.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        System.out.println(format);

    }
}
