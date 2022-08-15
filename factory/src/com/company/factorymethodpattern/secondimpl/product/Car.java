package com.company.factorymethodpattern.secondimpl.product;

public abstract class Car {
    protected String car;

    public void displayCar() {
        System.out.printf("Car model is: " + car);
    }
}
