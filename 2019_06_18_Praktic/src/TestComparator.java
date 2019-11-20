import java.util.Comparator;

public class TestComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer first, Integer second){
        int i1 = first;
        int i2 = second;
        return i1 < i1 ? -1 : (i1 == i2) ? 0 : 1;
    }
}
