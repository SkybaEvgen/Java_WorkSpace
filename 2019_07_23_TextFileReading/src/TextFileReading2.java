import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TextFileReading2 {
    public static void main(String[] args) {
        //Прочитать текст из файла и вывести на консоль
        try {
            Stream<String> lines = Files.lines(Paths.get("test.txt"));
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
