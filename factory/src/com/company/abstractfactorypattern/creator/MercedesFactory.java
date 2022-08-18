package com.company.abstractfactorypattern.creator;

import com.company.abstractfactorypattern.product.Car;
import com.company.abstractfactorypattern.product.Mercedes;

public class MercedesFactory implements CarFactory {
    @Override
    public Car createCar() {
        Car mercedes = new Mercedes(new MercedesComponentFactory());
        mercedes.initEngine();
        mercedes.initSpeaker();
        return mercedes;
    }
}
