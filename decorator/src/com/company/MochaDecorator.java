package com.company;

public class MochaDecorator extends Decorator {

    MochaDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Mocha";
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 9;
    }
}
