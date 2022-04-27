package com.company.factorypattern.creator;

import com.company.factorypattern.product.Car;
import com.company.factorypattern.product.Tesla;

public class TeslaFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Tesla();
    }
}
