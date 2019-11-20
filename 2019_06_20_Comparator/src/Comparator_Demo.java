import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Comparator_Demo {
    public static void main(String[] args) {
        String[] strings = {"a", "bbb", "cc", "dddd", "eeeeee"};

        Comparator<String> c = new Comparator<String>() {           //вариант реализации с помощью иннер класса т. е.
            @Override                                               //объявляем класс с помощью которого реализуем интерфейс и сразуже создаём объект этого класса, присваиваем переменной тип Comparator
            public int compare(String s, String t1) {               //и потом можем передавать его в метод сортировки или в любой другой метод, где нам нужен Comparator
                return Integer.compare(s.length(), t1.length());
            }
        };

        // Comparator на основе лямбда выражения
        Comparator<String> cl = (String a, String b) -> {                           //первый вариант реализации
            return Integer.compare(a.length(), b.length());
        };

        Comparator<String> cl2 = (a, b) -> {                                        //второй вариант реализации
            return Integer.compare(a.length(), b.length());
        };

        Comparator<String> cl3 = (a, b) -> Integer.compare(a.length(), b.length()); //третий вариант реализации

        Comparator<String> cl4 = Comparator.comparingInt(String::length);           //четвертый вариант реализации

        Arrays.sort(strings,cl);
        for (String s : strings)
        System.out.println(s);

        int[] values = {1,2,5,6};
        Summarize s1 = a -> a;
        System.out.println("array sum " + sumAll(values, s1));

        Summarize s2 = a -> (a%2 == 0 ? a : 0);
        System.out.println("array sum even " + sumAll(values, s2));

        NumberSumable ns = (a, b) -> a + b;
        ns.sum(2, 40);

        BiFunction<Integer, Integer, Integer> nb = (a, b) -> a + b;
        Integer result = nb.apply(2, 4);
        System.out.println(result);

        Predicate<String> p = s -> s.length() == 3;
        boolean q = p.test("asvdfv");
        System.out.println(q);


    }

    public static int sumAll(int[] input, Summarize s){
        int ret = 0;
        for (int a : input){
            ret = ret + s.get(a);
        }
        return ret;
    }
}
