import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
    public static List<String> getDuplicates(List<String> input){
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            if(set.contains(input.get(i)))
                list.add(input.get(i));
            else set.add(input.get(i));

            /*for(String a: input){
                if(set.contains(a)) list.add(a);
                else set.add(a);
            }*/
        }
        return list;
    }
}
