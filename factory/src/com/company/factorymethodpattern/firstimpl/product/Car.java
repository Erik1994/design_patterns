package com.company.factorymethodpattern.firstimpl.product;

public abstract class Car {
    protected String car;

    public void displayCar() {
        System.out.println("Car model is: " + car);
    }
}
