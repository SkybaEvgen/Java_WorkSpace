/*Есть список с именами: ​Ivan, Maria, Stephan, John, Amalia​.
 Написать функцию,которая вернет список, в котором не
 содержатся имена исходного списка,длиной 4.*/

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static List<String> filtername(List<String> list){
        List<String>list1 = new ArrayList<>();
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i).length()!=4){
               list1.add(list.get(i));
            }
        }
        return list1;
    }
}
