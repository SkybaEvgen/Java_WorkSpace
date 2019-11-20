import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//  чтение и запись данных из одного файла в другой (побайтово)
public class BinaryFileInputStream_Out {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("text.txt");
        FileOutputStream outputStream = new FileOutputStream("binOut.txt");
        int counter = 0;
        int in = 0;
//        byte[] buf = new byte[5];
        while ((in = inputStream.read()) != -1){
            outputStream.write(in); //записали данные из файла text.txt в файл binOut.txt
            counter++;
        }
        System.out.println("buffer read " + counter);
    }
}
