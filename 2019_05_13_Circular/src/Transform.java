public class Transform {
    public static void main(String[] args) {

        String testString = transform("a0bb0cd1e0");
        String test = transform("12345600ed0");
        System.out.println(testString);
        System.out.println(test);
    }

    public static String transform(String input){
        StringBuilder zeros = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (int i = 0; i < input.length(); i++){
           if (input.charAt(i) != '0'){                  //Character.isAlphabetic(input.charAt(i))
               others.append(input.charAt(i));
           }
           else {
               zeros.append(input.charAt(i));
           }
        }
        return zeros.append(others).toString();
    }

    public static String transformm(String input){
        String zeros = "";
        String others = "";

        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) != '0'){
                others+=input.charAt(i);
            }
            else {
                zeros+=input.charAt(i);
            }
        }
        return zeros + others;
    }
}
