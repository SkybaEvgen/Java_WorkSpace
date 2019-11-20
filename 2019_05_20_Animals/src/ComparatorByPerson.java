import java.util.Comparator;

public class ComparatorByPerson implements Comparator<Person> {

    public int compare(Person an1, Person an2){
        return an1.getName().compareTo(an2.getName());
    }


}
