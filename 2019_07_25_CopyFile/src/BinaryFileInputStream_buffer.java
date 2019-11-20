import java.io.FileInputStream;
import java.io.IOException;
//буферное чтение из файла
public class BinaryFileInputStream_buffer {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("text.txt");
        int counter = 0;
        int in = 0;
        byte[] buf = new byte[5];   // задали буфер разммером 5 байт
        while ((in = inputStream.read(buf)) != -1){
            System.out.println("bytes read per iteration " + in);   // проверяем, сколько байт читает за одну итерацию
            counter++;
        }
        System.out.println("buffer read " + counter);
    }
}
