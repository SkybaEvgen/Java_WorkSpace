import java.util.Comparator;

public class ComparatorByLetter implements Comparator<SortByLetter>{
    public int compare(SortByLetter s1, SortByLetter s2){
        return s1.toString().compareTo(s2.toString());
    }
}
