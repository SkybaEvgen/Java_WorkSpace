/*Даны две строки, вернуть их конкатенацию, но без
 первого символа в каждой. Строки ненулевой длины.
nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
*/

public class NonStart {
    public static void main(String[] args) {
        String a = "shotl";
        String b = "java";
        System.out.println(nonStart(a,b));
    }

    public static String nonStart(String a, String b){
        String c = a.substring(1, a.length()) + b.substring(1,b.length());
        return c;
    }
}
