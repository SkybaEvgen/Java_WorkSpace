/*Есть два списка одинаковой длины с числами.
 Написать функцию, котораявернет список с элементами Yes или No,
 где значение на i-том месте зависит оттого, равны ли элементы
 двух списков под номером i. Например, {1, 2, 3, 4} и {5,2, 3, 8}
 вернет {No, Yes, Yes, No}*/

import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static List<String> yesNo(List<Integer> list1, List<Integer> list2){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i)==list2.get(i)){
                list.add("Yes");
            }
            else list.add("No");
        }
        return list;
    }
}
