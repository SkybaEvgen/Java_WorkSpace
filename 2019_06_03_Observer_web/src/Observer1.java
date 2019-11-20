public class Observer1 implements Observer {
    @Override
    public void handleEven() {
        System.out.println("Observer1 received massage: Observed class has new");
    }
}
