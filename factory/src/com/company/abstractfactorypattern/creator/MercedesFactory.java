package com.company.abstractfactorypattern.creator;

import com.company.abstractfactorypattern.enums.EngineType;
import com.company.abstractfactorypattern.product.Car;
import com.company.abstractfactorypattern.product.Mercedes;

public class MercedesFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Mercedes(EngineFactory.createEngineFactory(EngineType.PETROL));
    }
}
