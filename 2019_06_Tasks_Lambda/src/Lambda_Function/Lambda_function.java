package Lambda_Function;

import java.util.function.*;

public class Lambda_function {
    public static void main(String[] args) {

        //Task1
        /*из двух целыхчисел вернуть их конткатенированное строчное представление.
         Пример:concat(10, 24) -> “1024”*/
        BiFunction<Integer, Integer, String> sc = (a, b) -> String.valueOf(a) + String.valueOf(b);
        String s = sc.apply(10, 24);
        System.out.println("Task1 " + s);

        //Task2
        /*вернуть true,если строка длины 3, false - иначе.
        Пример: check(“abc”) -> true. check(“absde”)-> false.*/
        Predicate<String> p = in -> in.length() == 3;
        boolean pp = p.test("asdfgf");
        System.out.println("Task2 " + pp);

        //Task3
        /*вернуть true, если строка четной длины, иначе - false.*/
        Predicate<String> p2 = in -> in.length()%2 == 0;
        boolean pp2 = p2.test("qwer ");
        System.out.println("Task3 " + pp2);

        //Task4
        /*вернуть сроку вupper case. Пример modify(“abcDe”) -> “ABCDE”*/
        Function<String, String> m = in -> in.toUpperCase();
        String mm = m.apply("qweKLdsLdd");
        System.out.println("Task4 " + mm);

        //Task5
        /*все строки длины 4 заменяются на звездочки*/
        Function<String, String> n = in -> in.length() == 4 ? in = "****" : in;
        String nn = n.apply("asdf");
        System.out.println("Task5 " + nn);

        //Task6
        /*полученная строка печатается в окружении восклицательных знаков.
        Пример: при вызовеprint(“abc”) печатается  ”!abc!”*/
        Consumer<String> c = in -> System.out.println("Task6 " + "!" + in + "!");
        c.accept("abc");

        //Task7
        /*вернуть строку “Hello World”*/
        Supplier<String> ss = () -> "Hello World";
        String s1 = ss.get();
        System.out.println("Task7 " + s1);
    }
}
