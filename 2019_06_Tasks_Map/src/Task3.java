/*Анаграмма слова x  - слово, по длине равное x и состоящее из таких же букв,что и x.
Например, слово “vani” является анаграммой слова “ivan”, а слова“naan” и “anan”
являются анаграммами слова “anna”. Дан словарь, сожержащийанаграммы, например
{“anna”, “ivan”, “naan”, “vani”, “piotr”, “nana”, “navi”}.
Написать функцию, которая по слову из словаря вернет все анаграммы этогослова,
которые есть в словаре. Например, по слову “ivan” функция вернет{“navi”, “vani”}*/
import java.util.*;

public class Task3 {
    private static Map<String, List<String >> voc = new HashMap<>();

    public static List<String> isAnagramm (List<String> list, String word){
        List<String> listWord = new ArrayList<>();
        String wordS = sortWord(word);
        for (String s : list){
            String sWord = sortWord(s);
            if(!voc.containsKey(sWord)){
                List<String> mlist = new ArrayList<>();
                mlist.add(s);
                voc.put(sWord, mlist);
            }else {
                List<String> strings = voc.get(sWord);
                strings.add(s);
            }
        }
        return voc.get(wordS);
    }

    public static String sortWord (String s){
        char[] str = s.toCharArray();
        Arrays.sort(str);
        return new String(str);
    }
}
