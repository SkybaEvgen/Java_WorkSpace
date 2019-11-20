import java.util.Comparator;

public class ComparatorByName implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
