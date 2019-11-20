import java.util.*;

    public class SortByLengthComparatorLambda{
    Comparator<String> s = Comparator.comparingInt(String::length);

}
