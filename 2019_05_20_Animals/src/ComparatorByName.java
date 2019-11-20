import java.util.Comparator;

public class ComparatorByName implements Comparator<Animal> {
    public int compare(Animal an1, Animal an2){
        return an1.getName().compareTo(an2.getName());
    }

    public int compare(Pet an1, Pet an2){
        return an1.getName().compareTo(an2.getName());
    }


}
