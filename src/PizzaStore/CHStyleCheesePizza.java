package PizzaStore;

public class CHStyleCheesePizza extends Pizza {
    public CHStyleCheesePizza() {
        name="Chicago Style deep dish cheese pizza";
        dough="Extra Thick Crust Dough";
        sauce="Plum Tomato Sauce";

        toppings.add("Shredded Mozzoralla Cheese");
    }

    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
