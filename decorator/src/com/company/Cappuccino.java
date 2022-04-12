package com.company;

public class Cappuccino extends Beverage{
    public Cappuccino() {
        description = "Cappuccino";
    }

    @Override
    public int getCost() {
        return 5;
    }
}
