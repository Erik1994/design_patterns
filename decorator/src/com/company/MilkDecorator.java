package com.company;

public class MilkDecorator extends Decorator {

    MilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Milk";
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 5;
    }
}
