package com.company;


import com.company.abstractfactorypattern.creator.CarFactory;
import com.company.abstractfactorypattern.product.Car;

public class Main {

    public static void main(String[] args) {
        //Factory method pattern

//        Car mercedes = CarFactory.createCarFactory(Model.MERCEDES).createCar();
//        mercedes.displayCar();


        //Abstract Factory pattern

       Car tesla = CarFactory.createCarFactory(com.company.abstractfactorypattern.enums.Model.TESLA).createCar();

    }
}
