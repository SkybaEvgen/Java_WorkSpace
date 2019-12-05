public class Counter2 {
    int counter;
    Object o = new Object();

    public synchronized void inc() {
        synchronized (o) {
            counter++;
        }
    }

    public synchronized void dec() {
        synchronized (o) {
            counter--;
        }
    }

    public int getCounter() {
        return counter;
    }
}
