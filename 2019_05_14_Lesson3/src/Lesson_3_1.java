public class Lesson_3_1 {

    private static double PI = 3.14;

    public static void main(String[] args) {
        Shape s = new Circle("test", 10);
    }

    public static double calculateCircleSquare (double r){
        return PI*r*r;
    }

    public static double calculateRactangleSquare (double a, double b){
        return a*b;
    }
}
