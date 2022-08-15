package com.company.factorymethodpattern.firstimpl.creator;

import com.company.factorymethodpattern.firstimpl.product.BMW;
import com.company.factorymethodpattern.firstimpl.product.Car;

public class BMWFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BMW();
    }
}
