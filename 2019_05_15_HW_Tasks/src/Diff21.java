/*Дано целое число n, вернуть абсолютную разницу между n и 21, но вернуть
удвоенную разницу, если n больше 21. Например:
diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
diff21(25) → 8
*/

public class Diff21 {
    public static void main(String[] args) {
        System.out.println(diff21(25));
    }

    public static int diff21(int n){
        int c = 21;
        if(n<=c) return c-n;
        else return (n-c)*2;
    }
}
