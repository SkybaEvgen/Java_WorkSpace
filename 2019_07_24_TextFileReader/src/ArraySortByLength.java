import java.util.Arrays;
import java.util.Comparator;

public class ArraySortByLength {
/* Task 2
Есть массив строк разной длины.
Отсортировать его по длине строк.
Пример:вход ​{“aaa”, “bbbb”, “a”, ‘bb”}​,
выход ​{“a”, “bbb”, “aaa”, “bbbb”}​.*/

    public static String[] arraySortByLength (String [] array){
        Arrays
                .stream(array)
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
        return array;
    }
}
