import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortByDateOfBirth {

    public static List<String> sortByDateOfBirth() throws IOException {
        Stream<String> lines = Files.lines(Paths.get("text.txt"), StandardCharsets.UTF_8);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(" dd MM yyyy");
        List<String> sline =lines
                .map(n -> Arrays.asList(n.split(",")))
                .sorted(Comparator.comparing(l -> LocalDate.parse(l.get(l.size()-1), dateTimeFormatter)))
                .map(Objects::toString)
                .collect(Collectors.toList());
        return sline;
    }
}
