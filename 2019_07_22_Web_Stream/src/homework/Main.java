package homework;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "b1", "c1", "a4", "c6", "b0");
        System.out.println(StreamHW.mapToUpperCase(list));

        List<Integer> list2 = Arrays.asList(1,4,16,256);
        System.out.println(StreamHW.returnSquareRoot(list2));

        List<String> names = asList("Homer Simpson", "Marge Simpson", "Bart Simpson", "Kent Brockman");
        System.out.println(StreamHW.getDistinctLetters(names));
    }
}
