package com.company.factorymethodpattern.firstimpl.creator;

import com.company.factorymethodpattern.firstimpl.product.Car;
import com.company.factorymethodpattern.firstimpl.product.Mercedes;

public class MercedesFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Mercedes();
    }
}
