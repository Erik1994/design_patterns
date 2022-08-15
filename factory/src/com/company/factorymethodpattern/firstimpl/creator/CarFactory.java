package com.company.factorymethodpattern.firstimpl.creator;

import com.company.factorymethodpattern.firstimpl.enums.Model;
import com.company.factorymethodpattern.firstimpl.product.Car;

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
