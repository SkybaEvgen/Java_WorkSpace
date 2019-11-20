import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class TextFileReading {
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");  // задаём формат даты, в который нам нужно превратить строку т.е. второй элемент массива

    public static void main(String[] args) {
        /*try (FileReader reader = new FileReader("test.txt");
            PrintWriter writer = new PrintWriter("out.txt")){
            int a = 0;
            int count = 0;
            while((a = reader.read()) != -1){
                System.out.print((char)a);
                writer.print((char)a);
                count ++;
            }
            System.out.println();
            System.out.println("characters read " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        // Условие задачи
        // В текстовом файле содержатся имена с датами рождений
        // Прочитать текстовый файл и отсортировать по дате рождения
        // Записать прочитанные данные в другой файл
        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"));    // читаем текстовый файл
             PrintWriter writer = new PrintWriter("out.txt")){                          // записываем текстовый файл
            //Ivan,2018-03-09 -> Person {name=Ivan, dateOfBirth=2018-03-09}
            reader.lines()
                    .map(s -> createPerson(s))
                    .sorted(Comparator.comparing(Person::getDateOfBirth))   // сортируем Person по дате рождения
//                    .forEach(System.out::println);  // выводим в консоль прочитанные данные
//                    .forEach(p -> writer.println(p.toString()));  // пишет данные в файл в том виде который возвращает метод toString
                    .forEach(p -> writer.println(createString(p))); // метод createString пишет данные в переопределенном виде (задаем сами)

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Person createPerson(String string){
        String[] data = string.split(",");                                  // из строки получаем массив из двух элементов (эти элементы разделены ",")
                                                                                  // date[0] = Ivan, date[1] = 2018-03-09
        return new Person(data[0], LocalDate.parse(data[1], formatter));          // LocalDate.parse(date[1], formatter) - этот метод превращает строку в дату
    }

    public static String createString (Person person){
        return person.getName() + "," + person.dateOfBirth.format(formatter);
    }
}
