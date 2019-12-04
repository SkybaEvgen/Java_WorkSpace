public class Demo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world");

        // creating new thread with extending Thread class
        SumIntegers sum = new SumIntegers();
        sum.start();
        sum.join();
//        sum.sleep(1);
        System.out.println(sum.getCounter());

        //creating new thread with Runnable interface
        SumIntegers2 sum2 = new SumIntegers2();
        Thread t = new Thread(sum2);
        t.start();
        //

    }
}
