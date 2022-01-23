package PizzaStore;

public class CHPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new CHStyleCheesePizza();
            case "veggie" -> new CHStyleVeggiePizza();
            case "clam" -> new CHStyleClamPizza();
            case "pepperoni" -> new CHStylePepperoniPizza();
            default -> null;
        };
    }
}
