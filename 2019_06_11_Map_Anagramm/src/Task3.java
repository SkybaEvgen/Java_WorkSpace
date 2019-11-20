import java.util.*;

public class Task3 {
    private static Map<String, List<String >> voc = new HashMap<>();
    public static List<String> list = Arrays.asList("anna", "ivan", "naan", "vani", "piotr", "nana", "navi");

    public static List <String> isAnagramm(String word){
        String s = sortWord(word);
        return voc.get(s);
    }

    public static void createVoc(){
        for (String s: list){

        }
    }

    public static String sortWord (String s){
        char[] str = s.toCharArray();
        Arrays.sort(str);
        return new String(str);
    }
}