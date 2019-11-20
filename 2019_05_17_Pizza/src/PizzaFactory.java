public class PizzaFactory {

    public Pizza createPizza(PizzaType type) {

            switch (type) {
                case PIZZA_SALAMI: return new PizzaSalami();
                case PIZZA_MOZARELLA: return new PizzaMozarella();
                case PIZZA_HAWAI: return new PizzaHawai();
                default: return null;
            }
        }
    }

