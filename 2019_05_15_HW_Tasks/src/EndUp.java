/*Дана строка, вернуть новую строку, где последние 3 символа в верхнем регистре
(заглавные). Если строка длины меньше 3, перевести это в заглавные.
endUp("Hello") → "HeLLO"
endUp("hi there") →"hi thERE"
endUp("hi") →"HI"
*/


public class EndUp {
    public static void main(String[] args) {
        System.out.println(endUp("Hello"));
    }

    public static String endUp(String str){
        if(str.length()<3) return str.toUpperCase();
        else {
            char a1 = str.charAt(str.length()-3);
            char a2 = str.charAt(str.length()-2);
            char a3 = str.charAt(str.length()-1);
            str = str.substring(0,str.length()-3) + Character.toUpperCase(a1) + Character.toUpperCase(a2) + Character.toUpperCase(a3);
        }
        return str;
    }
}
