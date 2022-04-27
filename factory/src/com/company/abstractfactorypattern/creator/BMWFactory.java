package com.company.abstractfactorypattern.creator;

import com.company.abstractfactorypattern.enums.EngineType;
import com.company.abstractfactorypattern.product.BMW;
import com.company.abstractfactorypattern.product.Car;

public class BMWFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BMW(EngineFactory.createEngineFactory(EngineType.PETROL));
    }
}
