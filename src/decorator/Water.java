package decorator;

import component.Beverage;

public class Water extends CondimentDecorator{
    Beverage beverage;

    public Water(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Water";
    }

    @Override
    public double cost() {
        return beverage.cost() + .05;
    }
}
