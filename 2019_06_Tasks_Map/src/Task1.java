/*Дана Map<String, String> map, написать функцию,
 которая вернет Мап, такую,если в есходной map
 есть ключ ‘a’ и ‘b’, то нужно создать новый ключ ‘ab’
 ссуммой значений от ключей a и b.
  Примеры:
  mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
  mapAB({"a": "Hi"}) → {"a": "Hi"}
  mapAB({"b": "There"}) → {"b": "There"}*/

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static Map<String, String> mapAB(Map<String, String> map){
        if(map.containsKey("a") && map.containsKey("b")){
            map.put("ab", (map.get("a")+map.get("b")));
        }
        return map;
    }
}