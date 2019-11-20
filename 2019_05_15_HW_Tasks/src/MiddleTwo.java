/*Дана строка четной длины. Вернуть строку из двух центральных символов, например строка "string" превратиться в "ri". Длина входной строки минимум 2.
middleTwo("string") →"ri"
middleTwo("code") → "od"
middleTwo("Practice") →"ct"
*/

public class MiddleTwo {
    public static void main(String[] args) {
        String c = "Practice";
        System.out.println(middleTwo(c));
    }

    public static String  middleTwo(String str){
        String a = str.substring(str.length()/2 - 1);
        String b = str.substring(str.length()/2);
        char a1 = a.charAt(0);
        char b1 = b.charAt(0);
        String c = new StringBuilder().append(a1).append(b1).toString();
        return c;
    }
}
