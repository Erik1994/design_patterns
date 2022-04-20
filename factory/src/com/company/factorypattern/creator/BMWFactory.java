package com.company.factorypattern.creator;

import com.company.factorypattern.product.BMW;
import com.company.factorypattern.product.Car;
import com.company.factorypattern.product.Mercedes;

public class BMWFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BMW();
    }
}
