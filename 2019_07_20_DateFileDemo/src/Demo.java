import java.io.BufferedReader;
import java.io.FileReader;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
            Stream<String> lines = bufferedReader.lines();
            lines.filter(s -> s.length()>=5).forEach(System.out::println);
        )catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
