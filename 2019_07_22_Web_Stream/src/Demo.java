import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("a1", "a3", "a1", "a2", "a4", "a1", "a3", "a4", "a2");

        List<String> sorted = collection
                .stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("sorted: " + sorted);

        List<String> sortedDistinct = collection
                .stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("sortedDistinct: " + sortedDistinct);

        List<String> sortedReverse = collection
                .stream()
                .sorted((o1, o2) -> -o1.compareTo(o2))
                .collect(Collectors.toList());
        System.out.println("sortedReverse: " + sortedReverse);

        Collection<People> peoples = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMAN),
                new People("Иван", 69, Sex.MAN),
                new People("Катя", 12, Sex.WOMAN)
        );

        List<People> sortedByName = peoples                 //сортировка по имени в обратном порядке
                .stream()
                .sorted(((o1, o2) ->
                        -o1.getName().compareTo(o2.getName())))
                .collect(Collectors.toList());
        System.out.println("people sorted by name: " + sortedByName);

        List<People> sortedBySexAndAge = peoples
                .stream()
                .sorted((o1, o2) ->
                        o1.getSex() != o2.getSex() ?
                                o1.getSex().compareTo(o2.getSex()) : o1.getAge().compareTo(o2.getAge()))
                .collect(Collectors.toList());
        System.out.println("people sorted by sex and age: " + sortedBySexAndAge);


    }
}
