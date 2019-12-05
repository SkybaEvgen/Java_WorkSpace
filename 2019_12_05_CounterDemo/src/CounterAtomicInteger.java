import java.util.concurrent.atomic.AtomicInteger;

public class CounterAtomicInteger {
    AtomicInteger counter = new AtomicInteger(0);

    public void inc() {
        counter.incrementAndGet();
    }

    public void dec() {
        counter.decrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }
}
