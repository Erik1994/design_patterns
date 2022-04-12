package com.company;

public class Main {

    public static void main(String[] args) {
        Beverage beverageEspresso = new Espresso();
        System.out.println(beverageEspresso.getDescription() + ", " + beverageEspresso.getCost());

        Beverage beverageCappuccino = new Cappuccino();
        beverageCappuccino = new MilkDecorator(beverageCappuccino);
        beverageCappuccino = new MochaDecorator(beverageCappuccino);
        System.out.println(beverageCappuccino.getDescription() + ", " + beverageCappuccino.getCost());
    }
}
