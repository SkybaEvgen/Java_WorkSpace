public class Demo {
    public static void main(String[] args) {
        try {
            int len = getEvenStringLength("abcdq");
            System.out.println(len);
        }catch (InvalidStringException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("All fine!");

    }
    
    public static int getEvenStringLength(String input) throws InvalidStringException {
        if(input.length() % 2 == 0){
            return input.length();
        }else {
            throw new InvalidStringException("Invalid length: " + input.length());
        }
    }
}
