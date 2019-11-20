import java.util.Comparator;

public class ComparatorByModel implements Comparator<Car> {

    public int compare(Car obj1, Car obj2){
        return obj1.getModel().compareTo(obj2.getModel());
    }
}
