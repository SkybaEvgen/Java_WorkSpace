public class Demo {
    public static void main(String[] args) {

        Printable p = new Printer();
        p.print("Hello World");

        Printable pAnon = new Printable() {
            @Override
            public void print(String s) {
                System.out.println(s);
            }
        };

        pAnon.print("Hello World2");

        Printable pL = s -> {
            System.out.println(s);
        };

        Countable c = (a, b) -> a + b;
       /* {
            *//*System.out.println("a = " + a);
            System.out.println("b = " + b);*//*
            return a + b;
        };*/

        int count = c.count(1,4);
        System.out.println(count);
    }
}
