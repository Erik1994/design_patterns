package com.company;

import com.company.abstractfactorypattern.enums.CarModelTypes;
import com.company.abstractfactorypattern.enums.EngineType;
import com.company.abstractfactorypattern.factory.EngineFactory;
import com.company.abstractfactorypattern.ifactory.IFactory;
import com.company.factorypattern.creator.CarFactory;
import com.company.factorypattern.enums.Model;
import com.company.factorypattern.product.Car;

public class Main {

    public static void main(String[] args) {
        //Factory method pattern
        Car mercedes = CarFactory.createCarFactory(Model.MERCEDES).createCar();
        mercedes.displayCar();
        //Abstract Factory pattern
//        IFactory engine = EngineFactory.getFactory(EngineType.ELECTRIC);
//        engine.getCar(CarModelTypes.FORD).assemble();

    }
}
