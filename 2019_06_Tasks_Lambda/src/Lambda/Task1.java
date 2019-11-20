package Lambda;

public class Task1 {
    public static void main(String[] args) {
        //Task1
        /*StringConcate sc = (a, b) -> String.valueOf(a) + String.valueOf(b);
        String concat = sc.concat(10,24);
        System.out.println(concat);*/

        //Task2
        /*Checkable ch = in -> in.length()==3 ? true : false;
        Boolean check = ch.check("abcs");
        System.out.println(check);*/

        //Task3
        /*Checkable tf = in -> in.length()%2 == 0 ? true : false;
        Boolean check = tf.check("abc");
        System.out.println(check);*/

        //Task4
        /*Transfomable tr = in -> in.toUpperCase();
        String modify = tr.modify("abcDe");
        System.out.println(modify);*/

        //Task5
        /*Transfomable ta = in -> in.length()==4 ? in = "****" : in;
        String modify = ta.modify("qwerq");
        System.out.println(modify);*/

        //Task6
        Printable pr = s -> System.out.println("!" + s + "!");
        pr.print("abc");


        //Task7
        /*Producable p = () -> "Hello World";
        System.out.println(p.produce());*/

    }


}
