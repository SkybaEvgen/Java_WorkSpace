public class Main {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();

        Pizza pizza = factory.createPizza(PizzaType.PIZZA_SALAMI);
        Pizza pizza1 = factory.createPizza(PizzaType.PIZZA_HAWAI);
        Pizza pizza2 = factory.createPizza(PizzaType.PIZZA_MOZARELLA);
        pizza.orderPizza();
        pizza1.orderPizza();
        pizza2.orderPizza();

        PizzaType[] values = PizzaType.values();
        for(PizzaType t:values){
            System.out.println(t);
        }

        PizzaType pizza_salami = PizzaType.valueOf("PIZZA_SALAMI");
        System.out.println("Pizza salami: " + pizza_salami);
    }
}
