import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int secret = (int)(Math.random() * 11);
        System.out.println("Guess the number from 0 to 10");
        System.out.println("Enter the number of attempts:");
        int attemps = Integer.parseInt(r.readLine());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int couunt = 0;
        for(int i = 0; i < attemps; i++){
            int x = Integer.parseInt(r.readLine());
            couunt+=1;
            if(x==secret){
                System.out.println("You guessed the secret number: " + secret);
                break;
            }
            if(couunt==attemps) {
                System.out.println("You lose");
                System.out.println("secret number was " + secret);
            }
        }
    }


}
