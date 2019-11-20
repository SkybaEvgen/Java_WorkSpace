public class Main {
    public static void main(String[] args) {

        String q ="qwert";
        System.out.println(reverseRec(q));

    }

    /*public static String reverse(String a){
        char[] string = a.toCharArray();
        char[] newString = new char [a.length()];
        for (int i = 0; i < a.length() ; i++) {
            newString[i] = string[string.length-i-1];
        }
        return new String(newString);
    }*/

    public static String reverseRec(String a){
        if(a.isEmpty()){
            return a;
        }
        return reverseRec(a.substring(1)) + a.charAt(0);
    }

    private static int sumRec(final int[] a, int i){
        System.out.println("i = " + i);
        if(i >= a.length - 1){
            return a[a.length-1];
        }
        return a[i] + sumRec(a, i+1);
    }

    private static int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n-1);
        return result;
    }
}
