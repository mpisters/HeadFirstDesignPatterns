package Starbuzz;

public class Soy extends CondimentDecorator{
    private final Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.33;
    }
}
