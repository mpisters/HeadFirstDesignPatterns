package PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicago = new CHPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(pizza.getName());

        pizza = chicago.orderPizza("cheese");
        System.out.println(pizza.getName());
    }
}
