package com.company.factorypattern.creator;

import com.company.factorypattern.enums.Model;
import com.company.factorypattern.product.Car;

public interface CarFactory {
    Car createCar();

    static CarFactory createCarFactory(Model carModel) {
        if (carModel == Model.MERCEDES) {
            return new MercedesFactory();
        } else if (carModel == Model.BMW) {
            return new BMWFactory();
        } else return new LexusFactory();
    }
}
