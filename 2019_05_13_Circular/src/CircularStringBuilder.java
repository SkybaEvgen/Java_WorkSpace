public class CircularStringBuilder {
    public static void main(String[] args) {
        System.out.println(isCircular("abc", "bca"));
    }

    public static boolean isCircular(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        String tmp = s2;
        for (int i = 0; i < s1.length(); i++) {
            char[] str = tmp.toCharArray();
            StringBuilder x = new StringBuilder();
            x.append(str[str.length - 1]);
            for (int j = 0; j < s2.length() - 1; j++) {
                x.append(str[j]);
            }
            String y = x.toString();
            if (s1.equals(y)) return true;
        }
        return false;
    }
}
