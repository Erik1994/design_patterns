package com.company.factorypattern.creator;

import com.company.factorypattern.product.Car;
import com.company.factorypattern.product.Mercedes;

public class MercedesFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Mercedes();
    }
}
