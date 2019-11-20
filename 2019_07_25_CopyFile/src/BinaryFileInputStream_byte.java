import java.io.FileInputStream;
import java.io.IOException;
//побайтовое чтение из файла
public class BinaryFileInputStream_byte {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("text.txt");
        int counter = 0;
        int in = 0;
        while ((in = inputStream.read()) != -1){
          counter++;
        }
        System.out.println("Bytes read " + counter);
    }
}
