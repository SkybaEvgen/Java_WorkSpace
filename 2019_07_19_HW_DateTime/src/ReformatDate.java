import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ReformatDate {
    public static List<String> reformatDates(List<String> list){
        List<String> listD = new ArrayList<>();
        for (String l : list){
            LocalDate parse = LocalDate.parse(l);
            String format = parse.format(DateTimeFormatter.ofPattern("dd MMMM, yyyy EEEE"));
            listD.add(format);
        }
        return listD;
    }
}
