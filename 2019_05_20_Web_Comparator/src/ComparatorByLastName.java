import java.util.Comparator;

public class ComparatorByLastName implements Comparator<Animal> {


    @Override
    public int compare(Animal o1, Animal o2) {
        String  s1=o1.getName();
        String  s2=o2.getName();
        char c1 = s1.charAt(s1.length()-1);
        char c2 = s2.charAt(s2.length()-1);
        if(c1>c2) return 1;
        if(c1<c2) return -1;
        return 0;
    }
}

