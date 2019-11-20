/*Написать функцию, которая реверсирует список, возвращает
 список элементов в обратном порядке.
 {1, 2, 3, 4, 5} -> {5, 4, 3, 2, 1}*/

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static List<Integer> reverseList (List<Integer> list){
        List<Integer> nList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            nList.add(list.get(list.size()-1-i));
        }
        return nList;
    }
}
