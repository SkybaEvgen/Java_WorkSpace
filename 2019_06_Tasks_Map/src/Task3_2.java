/*Анаграмма слова x  - слово, по длине равное x и состоящее из таких же букв,что и x.
Например, слово “vani” является анаграммой слова “ivan”, а слова“naan” и “anan”
являются анаграммами слова “anna”. Дан словарь, сожержащийанаграммы, например
{“anna”, “ivan”, “naan”, “vani”, “piotr”, “nana”, “navi”}.
Написать функцию, которая по слову из словаря вернет все анаграммы этогослова,
которые есть в словаре. Например, по слову “ivan” функция вернет{“navi”, “vani”}

Решение без использования HashMap.
*/

import java.util.*;

public class Task3_2 {
    public static List<String> anagramWord (List<String> list, String word){
        Map<String, List<String >> voc = new HashMap<>();
        List<String> listWord = new ArrayList<>();
        /*for (int i = 0; i < list.size(); i++){
            if(sortWord(word).equals(sortWord(list.get(i))))
                listWord.add(list.get(i));
        }*/
        for (String s : list){
            if(sortWord(word).equals(sortWord(s))){
                listWord.add(s);
            }
        }
        return listWord;
    }

    public static String sortWord (String s){
        char[] str = s.toCharArray();
        Arrays.sort(str);
        return new String(str);
    }
}

