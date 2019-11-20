import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Mic", 25);
        Person p2 = new Person("Nicolay", 30);
        Person p3 = new Person("Oliver", 42);
        Person p4 = new Person("Jony", 18);
        Person p5 = new Person("Yuriy", 34);
        Person p6 = new Person("Bil", 60);

        Person[] persons = {p1, p2, p3, p4, p5, p6};

        TwoPersons nameLength = (tp1, tp2) -> Integer.compare(tp1.getName().length(), tp2.getName().length());

        TwoPersons age = (ap1, ap2) -> Integer.compare(ap1.getAge(), ap2.getAge());

        int per = nameLength.per(p1,p6);
        System.out.println(per);

        int agep = age.per(p6, p3);
        System.out.println(agep);







    }
}
