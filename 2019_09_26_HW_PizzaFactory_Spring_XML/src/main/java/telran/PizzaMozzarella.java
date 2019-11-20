package telran;

public class PizzaMozzarella extends Pizza {
    private static String TYPE = "Pizza Mozzarella";

    public PizzaMozzarella() {
        super(TYPE);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Pizza with Mozzarella Cheese");
    }
}
