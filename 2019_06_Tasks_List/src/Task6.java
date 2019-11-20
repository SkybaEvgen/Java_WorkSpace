/*Объединить два списка в один.*/

import java.util.ArrayList;
import java.util.List;

public class Task6 {
    public static List<Integer> combineTwoList (List<Integer> list1, List<Integer> list2){
        List<Integer> nlist = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            nlist.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            nlist.add(list2.get(i));
        }
        return nlist;
    }
}
