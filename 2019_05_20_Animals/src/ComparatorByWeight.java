import java.util.Comparator;
public class ComparatorByWeight implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return (int)(o1.getWeight() - o2.getWeight());
    }

   // @Override
    public int compare(Pet o1, Pet o2) {
        return (int)(o1.getWeight() - o2.getWeight());
    }
}
