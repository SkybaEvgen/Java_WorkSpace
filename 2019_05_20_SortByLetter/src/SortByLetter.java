import java.util.Arrays;
import java.util.Comparator;

public class SortByLetter {

    public static void main(String[] args) {
        String st1 = "г Интерфейс";
        String st2 = "в это";
        String st3 = "б разновидность";
        String st4 = "а класса";
        String st[] = {st1, st2, st3, st4};

        Arrays.sort(st);
        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i]);
        }

        class ComparatorByLetter implements Comparator<SortByLetter> {
            public int compare(SortByLetter s1, SortByLetter s2) {
                return s1.toString().compareTo(s2.toString());
            }

            @Override
            public Comparator<SortByLetter> reversed() {
                return null;
            }

        }
        Arrays.sort(st, new ComparatorByLetter());


    }
}
