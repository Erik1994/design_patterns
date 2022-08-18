package com.company.abstractfactorypattern.creator;

import com.company.abstractfactorypattern.enums.EngineType;
import com.company.abstractfactorypattern.product.BMW;
import com.company.abstractfactorypattern.product.Car;

public class BMWFactory implements CarFactory {
    @Override
    public Car createCar() {
        //Car bmw = new BMW(EngineFactory.createEngineFactory(EngineType.PETROL));
        Car bmw = new BMW(new PetrolEngineFactory());
        bmw.initEngine();
        return bmw;
    }
}
