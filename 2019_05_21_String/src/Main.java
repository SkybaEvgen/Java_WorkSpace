import java.io.*;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String str = r.readLine();
        String[] w = str.split(" ");

        for (int i = 0; i < w.length; i++){
            if(w[i].length()==3){
                w[i]=w[i].toUpperCase();
            }
        }
        String strr = String.join(" ", w);
        System.out.println(strr);
    }

    String transform(String input){
        String[] w = input.split(" ");
        for (int i = 0; i < w.length; i++){
            if(w[i].length()==3){
                w[i]=w[i].toUpperCase();
            }
        }
        String strr = String.join(" ", w);
        return strr;
    }
}
