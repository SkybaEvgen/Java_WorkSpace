import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//  чтение и запись данных из одного файла в другой (используя буфер)
public class BinaryFileInputStream_Out_2 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("text.txt");
        FileOutputStream outputStream = new FileOutputStream("binOut.txt");
        int counter = 0;
        int in = 0;
        byte[] buf = new byte[5];
        while ((in = inputStream.read(buf)) != -1){
            outputStream.write(buf, 0, in); //записываем данные от 0 до in
            counter++;
        }
        System.out.println("buffer read " + counter);
    }
}
