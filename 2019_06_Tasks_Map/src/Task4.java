/*Дан список имен, где некоторые имена повторяются.
Написать функцию,которая по имени вернет
количество вхождений этого имени в список.*/

import java.util.*;

public class Task4 {
    public static int numberOfEntries (List<String> list, String name){
        int count=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(name)) count++;
        }
        return count;
    }
}
