/*Есть список с целыми числами.
Написать функцию, которая вернет
список без элементов, больше заданного.*/

import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static List<Integer> listWithoutElements (List<Integer> list, int n){
        List<Integer> nlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < n){
                nlist.add(list.get(i));
            }
        }
        return nlist;
    }
}
