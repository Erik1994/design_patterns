package com.company.abstractfactorypattern.creator;

import com.company.abstractfactorypattern.enums.EngineType;
import com.company.abstractfactorypattern.product.Car;
import com.company.abstractfactorypattern.product.Mercedes;

public class MercedesFactory implements CarFactory {
    @Override
    public Car createCar() {
        //Car mercedes = new Mercedes(EngineFactory.createEngineFactory(EngineType.PETROL));
        Car mercedes = new Mercedes(new PetrolEngineFactory());
        mercedes.initEngine();
        return mercedes;
    }
}
