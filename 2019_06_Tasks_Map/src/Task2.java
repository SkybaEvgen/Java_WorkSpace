/*Дан массив букв, вернуть мапу Map<String, Boolean> где каждая
строкаявляется ключем, а значением true, если строка в массиве
больше одного разаи false, если только один раз.
Примеры:
wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}*/

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static Map<String, Boolean> worldMultiple (String[] myarr){
        Map<String, Boolean> wM = new HashMap<>();
        for (int i = 0; i < myarr.length; i++) {
            if(wM.containsKey(myarr[i]))
            wM.put(myarr[i], true);
            else wM.put(myarr[i], false);
        }
        return wM;
    }
}
