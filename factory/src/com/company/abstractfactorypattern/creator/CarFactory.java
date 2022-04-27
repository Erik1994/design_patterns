package com.company.abstractfactorypattern.creator;

import com.company.abstractfactorypattern.enums.Model;
import com.company.abstractfactorypattern.product.Car;

public interface CarFactory {
    Car createCar();

    static CarFactory createCarFactory(Model carModel) {
        if (carModel == Model.MERCEDES) {
            return new MercedesFactory();
        } else if (carModel == Model.BMW) {
            return new BMWFactory();
        } else return new TeslaFactory();
    }
}
