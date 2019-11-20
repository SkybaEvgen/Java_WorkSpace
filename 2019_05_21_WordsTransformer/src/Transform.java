import java.sql.SQLOutput;

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

    /*public static String transformStringBuffer(String input){
        String [] words = input.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < words.length; i++){
            if(words[i].length() == 3){
                sb.append(words[i].toUpperCase());
            } else {
                sb.append(words[i]);
            }
            sb.append(" ");
        }
        return sb.toString().trim();        // trim - удаление пробелов с двух концов строки
    }*/
}
