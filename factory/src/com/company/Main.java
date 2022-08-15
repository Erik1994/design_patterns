package com.company;


import com.company.factorymethodpattern.firstimpl.creator.CarFactory;
import com.company.factorymethodpattern.firstimpl.enums.Model;
import com.company.factorymethodpattern.firstimpl.product.Car;
import com.company.factorymethodpattern.secondimpl.creator.MercedesFactory;

public class Main {

    public static void main(String[] args) {
        //Factory method pattern
        //First impl

        Car tesla = CarFactory.createCarFactory(Model.TESLA).createCar();
        tesla.displayCar();

        com.company.factorymethodpattern.secondimpl.creator.CarFactory mercedesFactory = new MercedesFactory();
        com.company.factorymethodpattern.secondimpl.product.Car mercedesAutomate = mercedesFactory.createCar(com.company.factorymethodpattern.secondimpl.enums.Model.AUTOMATE);
        mercedesAutomate.displayCar();

        //Abstract Factory pattern

       //
        //
        //  Car tesla = CarFactory.createCarFactory(com.company.abstractfactorypattern.enums.Model.TESLA).createCar();

    }
}
