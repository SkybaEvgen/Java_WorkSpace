public class PizzaMozarella extends Pizza {
    private static String TYPE = "Pizza Mozarella";

    public PizzaMozarella() {
        super(TYPE);
    }

    @Override
    public void prepare() {
        System.out.printf("Preparing Pizz with Mozarella, Tomato");
    }
}
