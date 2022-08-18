package com.company.abstractfactorypattern.creator;

import com.company.abstractfactorypattern.enums.EngineType;
import com.company.abstractfactorypattern.product.Car;
import com.company.abstractfactorypattern.product.Tesla;

public class TeslaFactory implements CarFactory {
    @Override
    public Car createCar() {
        //Car tesla = new Tesla(EngineFactory.createEngineFactory(EngineType.ELECTRIC));
        Car tesla = new Tesla(new ElectricEngineFactory());
        tesla.initEngine();
        return tesla;
    }
}
