package com.company.factorymethodpattern.firstimpl.creator;

import com.company.factorymethodpattern.firstimpl.product.Car;
import com.company.factorymethodpattern.firstimpl.product.Tesla;

public class TeslaFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Tesla();
    }
}
