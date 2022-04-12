package com.company;

public abstract class Decorator extends Beverage {
    protected Beverage beverage;
    public abstract String getDescription();
    public abstract int getCost();
}
