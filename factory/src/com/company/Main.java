package com.company;


import com.company.abstractfactorypattern.creator.CarFactory;
import com.company.abstractfactorypattern.enums.Model;
import com.company.abstractfactorypattern.product.Car;
import com.company.factorymethodpattern.secondimpl.creator.MercedesFactory;

public class Main {

    public static void main(String[] args) {
        //Factory method pattern
        //First impl

//        Car tesla = CarFactory.createCarFactory(Model.TESLA).createCar();
//        tesla.displayCar();
//
//        //Second impl
//        com.company.factorymethodpattern.secondimpl.creator.CarFactory mercedesFactory = new MercedesFactory();
//        com.company.factorymethodpattern.secondimpl.product.Car mercedesAutomate = mercedesFactory.createCar(com.company.factorymethodpattern.secondimpl.enums.Model.AUTOMATE);
//        mercedesAutomate.displayCar();

        //Abstract Factory pattern
        Car tesla = CarFactory.createCarFactory(Model.TESLA).createCar();
    }
}
