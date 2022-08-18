package com.company.abstractfactorypattern.creator;

import com.company.abstractfactorypattern.product.Car;
import com.company.abstractfactorypattern.product.Tesla;

public class TeslaFactory implements CarFactory {
    @Override
    public Car createCar() {
        Car tesla = new Tesla(new TeslaComponentFactory());
        tesla.initEngine();
        tesla.initSpeaker();
        return tesla;
    }
}
