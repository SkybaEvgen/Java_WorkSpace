import java.util.Comparator;

public class ComparatorByColor implements Comparator<Animal> {
    public int compare(Animal an1, Animal an2){
        return an1.getColor().compareTo(an2.getColor());
    }

    public int compare(Pet an1, Pet an2){
        return an1.getColor().compareTo(an2.getColor());
    }
}
