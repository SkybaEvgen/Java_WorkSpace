import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class CustomCollectorDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Ivan", 15);
        Person p2 = new Person("Bob", 28);
        Person p3 = new Person("Jack", 35);
        Person p4 = new Person("Mik", 14);

        Supplier<Box> supp = () -> {
            System.out.println("Supplying strting value");
            return new Box(0);
        };

        BiConsumer<Box, Person> accumulator = (result, person) -> {
            result.setAmount(result.getAmount() + person.getAge());
            System.out.println(result.getAmount() + " " + person);
        };

        BinaryOperator<Box> combiner = (res1, res2) -> {
            System.out.println("Combining results");
            res1.setAmount(res1.getAmount() + res2.getAmount());
            return res1;
        };

        Collector<Person, Box, Box> collector = Collector.of(
                supp,
                accumulator,
                combiner,
                Collector.Characteristics.CONCURRENT
        );

        Box box = Stream.of(p1, p2, p3, p4)
                //.parallel()
                .collect(collector);
    }
}
