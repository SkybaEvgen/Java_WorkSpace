/*Дан текст, подсчитать, какое слово встречается больше остальных.
Слова в предложениях могут разделяться запятыми, точками, пробелами.
Предлоги [в,на, из, под] и остальные не учитывать при подсчете.*/

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static Map<String, Integer> maxCountWord (String string){
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        String s1 =string.toLowerCase();
        String[] str = s1.split("\\s+");        // "\\s+" игнорировать spase и tab
        for (String s : str){
            if(!map.containsKey(s)){
                map.put(s, 1);
            }else {
                map.put(s, map.get(s)+1);
            }
        }
        //int max = Collections.max(map.values());
        for(Map.Entry entry : map.entrySet()){
            int max = Collections.max(map.values());
            if(map.containsValue(max)){
               // map2.put();
            }
        }

        //System.out.println(max);

        return map;
    }
}
