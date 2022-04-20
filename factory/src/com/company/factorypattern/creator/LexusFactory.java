package com.company.factorypattern.creator;

import com.company.factorypattern.product.Car;
import com.company.factorypattern.product.Lexus;
import com.company.factorypattern.product.Mercedes;

public class LexusFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Lexus();
    }
}
