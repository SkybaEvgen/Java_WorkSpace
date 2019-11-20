    public class Circular {
        public static void main(String[] args) {

            System.out.println(isCircular("abcd", "dabc"));

        }
/*
        public static boolean isCircularr(String s1, String s2) {
            if(s1.length()==s2.length()){
                for (int i = 0; i < s1.length(); i++) {
                    char[] str = s2.toCharArray();
                    StringBuilder x = new StringBuilder();
                    x.append(str[str.length - 1]);
                    for (int j = 0; j < s2.length() - 1; j++) {
                        x.append(str[j]);
                    }
                    if (s1.equals(x)) break;
                }
            }
            return false;
        }*/

        public static boolean isCircular(String s1, String s2){
            if(s1.length()!=s2.length()) return false;
            String tmp = s1;
            for (int i = 0; i < s1.length(); i++){
                tmp = tmp.charAt(tmp.length()-1) + tmp.substring(0, tmp.length()-1);
                if(tmp.equals(s2)){
                    return true;
                }
            }
            return false;
        }
    }



    public static int getLongestSubstring(String input){

    }





/*
        String s1 = "abcdef";
        char[] str = s1.toCharArray();              // создаём из строки массив чаров
        StringBuilder s2 = new StringBuilder();
        s2.append(str[str.length-1]);               // получили последний символ
        for (int i=0; i<s1.length()-1; i++) {
            s2.append(str[i]);                      // к последнему символу добавляем по одному символу начиная с 1-го
        }
        System.out.println(s2);

       */