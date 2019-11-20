public class Demo {
    static Integer test;

    public static void main(String[] args) {

        if(test == 42){
            System.out.println("Unbelievable!!!");
        }

        // very slow code!!!
        Long counter = 0L;
        for (int i = 0; i <Integer.MAX_VALUE ; i++) {
            counter ++;
        }

        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

        System.out.println(i1==i2);

        Integer i3 = 10;
        Integer i4 = 10;

        System.out.println(i3 == i4);

        Integer t1 = 10;
        Integer t2 = 20;

        TestComparator tc1 = new TestComparator();

        System.out.println(tc1.compare(t1, t2));
    }
}
