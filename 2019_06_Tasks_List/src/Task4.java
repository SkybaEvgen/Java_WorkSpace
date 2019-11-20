/*Есть два списка с буквами. Определить, является ли один список циклической версией
 другого. Например, для списков {aa, bb, cc, dd} и {cc, dd, aa, bb}результат будет
 true, а для {dd, ee, ff} и {dd, ff, ee} - false.*/

import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public static boolean cyclicalList (List<String> list1, List<String> list2){
        if (list1.size()!=list2.size()) return false;
        List<String> list = new ArrayList<>();
        for (int i = 0; i <list2.size() ; i++) {
            list.add(list2.get(i));
        }
        for (int i = 0; i <list1.size() ; i++) {
        list.add(0,list2.get(list1.size()-1));
        list.remove(list1.size());
        list2=list;
        if(list1.equals(list)) return true;
        }
        return false;
    }
}
