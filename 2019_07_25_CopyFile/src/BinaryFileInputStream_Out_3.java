import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

//  чтение интернет страницы и запись всего содержимого в текстовый файла в другой
public class BinaryFileInputStream_Out_3 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.lib.ru");
        try (InputStream inputStream = url.openStream();
            FileOutputStream outputStream = new FileOutputStream("binOut.html")){
            int counter = 0;
            int in = 0;
            byte[] buf = new byte[1024];
            while ((in = inputStream.read(buf)) != -1) {
                outputStream.write(buf, 0, in); //записываем данные от 0 до in
                counter++;
            }
            System.out.println("buffer read " + counter);
        }
    }
}