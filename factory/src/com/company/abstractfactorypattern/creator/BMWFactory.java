package com.company.abstractfactorypattern.creator;

import com.company.abstractfactorypattern.product.BMW;
import com.company.abstractfactorypattern.product.Car;

public class BMWFactory implements CarFactory {
    @Override
    public Car createCar() {
        Car bmw = new BMW(new BMWComponentFactory());
        bmw.initEngine();
        bmw.initSpeaker();
        return bmw;
    }
}
