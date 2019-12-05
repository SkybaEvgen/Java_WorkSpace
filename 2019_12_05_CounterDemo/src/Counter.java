public class Counter {
    int counter;

    public synchronized void inc() {
        counter++;
    }

    public synchronized void dec() {
        counter--;
    }

    public int getCounter() {
        return counter;
    }
}
