package com.company.abstractfactorypattern.product;

public abstract class Car {
    protected String car;
    protected Engine engine;

    abstract void initEngine();

    public void displayCar() {
        System.out.printf("Car model is: " + car);
    }
}
