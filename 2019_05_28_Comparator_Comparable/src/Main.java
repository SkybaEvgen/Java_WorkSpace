import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ivan", 15);
        Person p2 = new Person("Piotr", 10);
        Person p3 = new Person("Maria", 25);
        Person p4 = new Person("Elena", 6);

        System.out.println(p2.compareTo(p1));
        Person[] person = {p1, p2, p3, p4};

        Arrays.sort(person);
        for (Person p: person){
            System.out.println(p);
        }

        Arrays.sort(person,new SortByNameComparator());
        for (Person p: person){
            System.out.println(p);
        }
    }
}
