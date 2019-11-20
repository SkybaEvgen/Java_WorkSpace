import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"ivan", "maria", "ivan", "maria", "anna", "ivan"};
        System.out.println(countWord(words));
    }

    public static Map <String, Integer> countWord (String[]word){
       Map<String, Integer>map = new HashMap<>();
       for (String s: word){
           if(!map.containsKey(s)){
               map.put(s, 1);
           }else {
               map.put(s, map.get(s)+1);
           }

       }
       return map;
    }
}
