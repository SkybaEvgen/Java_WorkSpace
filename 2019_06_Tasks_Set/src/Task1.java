import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1 {
    public static List<String> removeDuplicates(List<String> input){
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            set.add(input.get(i));
        }
        list.addAll(set);
        return list;
    }
}
