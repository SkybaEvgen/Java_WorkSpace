public class CounterThreads {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread counterThreadIncrement = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("increment " + counter.inc());
            }
        });

        Thread counterThreadDecrement = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("decrement " + counter.dec());
            }
        });

        counterThreadIncrement.start();
        counterThreadIncrement.join();
        counterThreadDecrement.start();
        counterThreadDecrement.join();

        System.out.println("counter " + counter.getValue());
    }

}

class Counter /*extends Thread*/ {
    private int count;

    public int inc() {
        return count++;
    }

    public int dec() {
        return count--;
    }

    public int getValue() {
        return count;
    }
}
