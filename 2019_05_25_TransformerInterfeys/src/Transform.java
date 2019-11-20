public class Transform {

    public static void main(String[] args) {
        System.out.println(transform("aaa BBBb dEFas asd ASdD cvbfd qwerf", new ToStarsTransformer()));
    }

    public static String transform(String input, WordsTransformer t){
        String[] words = input.split(" ");
        for (int i = 0; i<words.length; i++){
            if(t.check(words[i])){
                words[i] = t.transform(words[i]);
            }
        }
        return String.join(" ", words);
    }

}
