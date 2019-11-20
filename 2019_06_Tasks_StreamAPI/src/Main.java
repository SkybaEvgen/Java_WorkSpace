import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Persons.Address a1 = new Persons.Address("Ушинского", 10);
        Persons.Address a2 = new Persons.Address("Волынская", 5);
        Persons.Address a3 = new Persons.Address("Ахматовой", 17);
        Persons.Address a4 = new Persons.Address("Крещатик", 1);
        Persons.Address a5 = new Persons.Address("Политехническая", 3);

        Persons.Person p1 = new Persons.Person("Николай", 25, a1);
        Persons.Person p2 = new Persons.Person("Михаил", 16, a2);
        Persons.Person p3 = new Persons.Person("Александр", 32, a3);
        Persons.Person p4 = new Persons.Person("Евгений", 98, a4);
        Persons.Person p5 = new Persons.Person("Юрий", 15, a5);

        PersonBA.Person pp1 = new PersonBA.Person("Mic");
        PersonBA.Person pp2 = new PersonBA.Person("Bob");
        PersonBA.BankAccount ba1 = new PersonBA.BankAccount("123654", pp1);
        PersonBA.BankAccount ba2 = new PersonBA.BankAccount("951753", pp2);
        PersonBA.BankAccount ba3 = new PersonBA.BankAccount("741258", pp1);
        PersonBA.BankAccount ba4 = new PersonBA.BankAccount("369258", pp2);

        List<Persons.Person> person = Arrays.asList(p1, p2, p3, p4, p5);
        List<PersonBA.BankAccount> listBA = Arrays.asList(ba1, ba2, ba3, ba4);

        //Task 1
        /*Нужно написать функцию, которая по списку persons вернет
        список адресов тех людей, чей возраст больше 17 лет*/
        System.out.println("Task1");
        List<Persons.Address> address = person
                .stream()
                .filter(i -> i.getAge()>17)
                .map(Persons.Person::getAddress)
                .collect(Collectors.toList());
        System.out.println(address);
        System.out.println();

        //Task2
        /*Есть список имен, нужно написать функцию,
        которая вернет список имен без дупликатов.*/
        System.out.println("Task2");
        List<String> listName = Arrays.asList("Боб", "Валера", "Жора", "Боб", "Витя", "Жора", "Боб");
        List<String> listN = listName
                .stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(listN);
        System.out.println();

        //Task3
        /*Есть список людей, нужно написать функцию,
        которая вернет мапу, где ключом является возраст,
        а значением список людей этого возраста.*/
        System.out.println("Task3");
        Map<Integer, Persons.Person> myMap = person
                .stream()
                .collect(Collectors.toMap(Persons.Person::getAge, person1 -> person1));
        System.out.println(myMap);
        System.out.println();

        //Task4
        /*Есть два класса:
        public class BankAccount {
          String IBANN;
          Person owner;
          }
        public class Person {
         String name;
         }
        нужно написать функцию, которая возвращает мапу,
        где ключом является Person, а значением - список его банковских счетов.
        */
        System.out.println("Task4");
        Map<PersonBA.Person, List<PersonBA.BankAccount>> mapBankk = listBA
                .stream()
                .collect(Collectors.groupingBy(i -> i.getOwner()));
        mapBankk.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println();

        //Task5
        /*Написать функцию, которая для списка счетов,
        возвращает список IBANNs,где в каждом IBANN символы
        после 3-го и до конца заменены звездочками*/
        System.out.println("Task5");
        List<String> listIBAN = listBA
                .stream()
                .map(PersonBA.BankAccount::getIBAN)
                .map(i -> (i.substring(0, 2) + i.substring(2).replaceAll("\\d", "*")))
                .collect(Collectors.toList());
        System.out.println(listIBAN);
        System.out.println();

        //Task6
        /*Написать функцию, которая принимает предложение,
        а возвращает количество слов, начинающихся на заданную букву*/
        System.out.println("Task6");
        String sentence = "collections and streams while bearing some superficial similarities have different goals";
        String letter = "s";
        List<String> lists = Arrays.asList(sentence.split(" "));
        long count = (lists.stream().filter(i -> i.startsWith(letter)).count());
        //Integer count = Math.toIntExact(lists.stream().filter(i -> i.startsWith(letter)).count());
        System.out.println(count);

        //Task7
        /*Написать функцию, которая проверяет, является ли заданная строка целым числом.
        Подсказка - Character.isDigit() и Stream.allMatch().*/
        System.out.println("Task7");
        String q = "12345";



    }

}
