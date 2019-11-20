/* Task 6
Есть файл:
Sergey,Lukichev,Notebook Lenovo,500
Piotr,Ivanov,Apple MacBook,800
Sergey,Lukichev,Keyboard Cherry,25
Ivan,Petrov,Mouspad,5
Piotr,Ivanov,Apple Touchpad,60
То есть список имен с оборудованием и оценочной стоимостью.
Имена могутповторяться. Нужно написать программу, которая вернет файл
с отсортированным посумме списком имен и суммой по стоимости
для каждого человека:
Ivan Petrov,5
Sergey Lukichev,525
Piotr Ivanov,860*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortNameAndSum {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("task6.txt"))) {

            //reading lines and creating a map where name is the key and sum of gadgets of person is the value
            //чтение строк и создание мар, где имя является ключем, а сумма гаджетов person является значением
            Map<String, Integer> collect = br.lines()
                    .map(s -> stringToPerson(s))
                    .collect(Collectors.groupingBy(Person::getFullName, Collectors.summingInt(p->p.gadget.priceTag)));


            //sorting map entries by value
            List<Entry<String, Integer>> entries = new ArrayList<>(collect.entrySet());
            entries.sort(Entry.comparingByValue());

            //output. replace with the PrintWriter for saving to a file
            entries.forEach(e -> System.out.println(e.getKey()+" "+e.getValue()));
        }
    }

    public static Person stringToPerson(String s) {
        String[] split = s.split(",");
        Gadget gadget = new Gadget(split[2], Integer.parseInt(split[3]));
        Person person = new Person (split[0], split[1], gadget);
        return person;
    }

    public static String fullName(Person p) {
        return p.firstName+p.lastName;
    }
}
