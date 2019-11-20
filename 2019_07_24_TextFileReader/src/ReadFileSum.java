import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileSum {
/* Task 1
Есть текстовый файл, где каждая строка - целое число.
Написать функцию, которая принимает имя файла, возвращает сумму чисел из файла.*/
    public static int readFileSum(String fileName){
        FileReader file = null;
        try {
            file = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert file != null;
        BufferedReader reader = new BufferedReader(file);
        return reader.lines().mapToInt(Integer::parseInt).sum();
    }

    /*public static void readFileSum2(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("text1.txt"));
            System.out.println(reader.lines().mapToInt((p) -> Integer.parseInt(p)).sum());
        }catch (IOException e){
            e.printStackTrace();
        }
    }*/
}
