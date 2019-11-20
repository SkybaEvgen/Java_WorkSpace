import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Ivan");
        Consumer<String> stringConsumer = s -> System.out.println(s.length());
        optional.ifPresent(stringConsumer);

        List<Integer> integers = Arrays.asList(1,2,3,4,5);

        Optional<Integer> moreThan = getMoreThan(integers, 10);
        moreThan.ifPresent(integer -> System.out.println(integer.toString()));
    }

    public static Optional<Integer> getMoreThan(List<Integer> list, int a){
        for (Integer i: list){
            if(i > a){
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }

    public static Optional<Integer> getMoreThan2(List<Integer> list, int a){
        Optional<Integer> first = list.stream().filter(i -> i > a).findFirst();
        return first;
    }
}
