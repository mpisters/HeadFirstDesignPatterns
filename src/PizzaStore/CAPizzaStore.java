package PizzaStore;

public class CAPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new CAStyleCheesePizza();
            case "veggie" -> new CAStyleVeggiePizza();
            case "clam" -> new CAStyleClamPizza();
            case "pepperoni" -> new CAStylePepperoniPizza();
            default -> null;
        };
    }
}
