package com.company.abstractfactorypattern.product;

public abstract class Car {
    protected String car;
    protected Engine engine;
    protected Speaker speaker;

    public abstract void initEngine();
    public abstract void initSpeaker();

    public void displayCar() {
        System.out.printf("Car model is: " + car);
    }
}
