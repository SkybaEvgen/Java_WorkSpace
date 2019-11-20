import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String input = "aBc deFG lKm OPrst";

        Predicate<String> p = s -> s.length() == 3;

        //Function<String, String> f = s -> s.toUpperCase();        // идентичная запись
        Function<String, String> f = String::toUpperCase;

        //Consumer<String> c = s -> System.out.println(s);          // идентичная запись
        Consumer<String> c = System.out::println;
        print(c, "Hello World 1");
        c.accept("Hello Method Reference");

        print(System.out::println, "Hello World 2");

        System.out.println(transform(input, p, f));

    }

    public static void print(Consumer<String> c, String text){
        c.accept(text);
    }

    public static String transform(String sentence, Predicate<String> p, Function<String, String> f){
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(p.test(words[i])){
                words[i] = f.apply(words[i]);
            }
        }
        return String.join(" ", words);
    }
}
