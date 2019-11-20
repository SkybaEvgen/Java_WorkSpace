public class ToStarsTransformer extends WordsTransformer {
    public boolean check (String input){
        return input.length() == 5;
    }

    public String transform(String string){
        return string = "*";
    }
}
