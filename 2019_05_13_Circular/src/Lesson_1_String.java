public class Lesson_1_String {
    public static void main(String[] args) {
        String string = "Ivan";
        String string3 = "Ivan";
        String string2 = new String("Ivan");

        System.out.println(string + " " + string2);
        System.out.println(string == string2);
        System.out.println(string.equals(string2));
        System.out.println(string == string3);

        String helloWorld = "Hello";
        helloWorld += "World";
        System.out.println(helloWorld);

        StringBuilder sb = new StringBuilder("Test");
        sb.append("aqwe");                                 // метод append добавляет символы
        System.out.println(sb);
    }
}
