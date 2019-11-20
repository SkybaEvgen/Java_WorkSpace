public class ToUpperCase extends WordsTransformer {

    public boolean check (String input){
        return input.length() == 3;
    }

    public String transform(String string){
        return string.toUpperCase();
    }

}
