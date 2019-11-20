import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyMain {
    public static void main(String[] args) {

        //Tasks1
        /*Task1.Address a1 = new Task1.Address("Lenina", 1);
        Task1.Address a2 = new Task1.Address("Pushkina", 5);
        Task1.Address a3 = new Task1.Address("Sadovaya", 10);

        Task1.Person p1 = new Task1.Person("Иванов", a1);
        Task1.Person p2 = new Task1.Person("Петров", a2);
        Task1.Person p3 = new Task1.Person("Сидоров", a3);

        List<Task1.Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        List<Task1.Address> add = Task1.getAddresses(persons);
        System.out.println(add);*/

        //Task2
        /*List<String> list = Arrays.asList("Ivan", "Maria", "Stephan", "Amalia", "John");
        List<String> strings = Task2.filtername(list);
        System.out.println(strings);*/

        //Task3
        /* List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(5,2,3,8);
        List<String> list3 = Task3.yesNo(list1,list2);
        System.out.println(list3);*/

        //Task4
        /*List<String> list4 = Arrays.asList("aa", "bb", "cc", "dd");
        List<String> list5 = Arrays.asList("cc", "dd", "aa", "bb");
        List<String> list6 = Arrays.asList("dd", "ee", "ff");
        List<String> list7 = Arrays.asList("dd", "ff", "ee");
        System.out.println(Task4.cyclicalList(list4,list5));
        System.out.println(Task4.cyclicalList(list6,list7));*/

        //Task5
        /*List<Integer> list8 = Arrays.asList(1,2,3,4,5);
        System.out.println(Task5.reverseList(list8));*/

        //Task6
        /*List<Integer> list9 = Arrays.asList(1,2,3,4);
        List<Integer> list10 = Arrays.asList(5,2,3,8);
        System.out.println(Task6.combineTwoList(list9,list10));*/

        //Task7
        List<Integer> list11 = Arrays.asList(1,12,7,9,25,96,3,41,8,105);
        System.out.println(Task7.listWithoutElements(list11,10));

    }
}
