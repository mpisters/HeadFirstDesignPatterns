package Starbuzz;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;

    @Override
    public double cost() {
        return 0;
    }

    public abstract String getDescription();
}
