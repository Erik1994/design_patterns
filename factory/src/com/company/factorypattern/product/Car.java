package com.company.factorypattern.product;

public abstract class Car {
    protected String car;

    public void displayCar() {
        System.out.printf("Car model is: " + car);
    }
}
