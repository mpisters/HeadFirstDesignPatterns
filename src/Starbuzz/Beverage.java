package Starbuzz;

public abstract class Beverage {
    public enum Size {Tall, Grande, Vent};
    Size size = Size.Tall;
    String description = "Unknown beverage";

    public String getDescription(){
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
