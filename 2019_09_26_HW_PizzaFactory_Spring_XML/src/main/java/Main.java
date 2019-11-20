import telran.Pizza;
import telran.PizzaFactory;
import telran.PizzaType;

public class Main {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();

        String s = "PIZZA_SALAMI";

        PizzaType pizzaType = PizzaType.valueOf(s);

        Pizza pizza = factory.createPizza(pizzaType);

        Pizza pizza2 = factory.createPizza(PizzaType.PIZZA_MOZARELLA);

        pizza.orderPizza();
        pizza2.orderPizza();

    }
}