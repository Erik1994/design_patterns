package com.company.abstractfactorypattern.factory;

import com.company.abstractfactorypattern.car.ElectricFord;
import com.company.abstractfactorypattern.car.ElectricToyota;
import com.company.abstractfactorypattern.enums.CarModelTypes;
import com.company.abstractfactorypattern.icar.Car;
import com.company.abstractfactorypattern.ifactory.IFactory;

public class ElectricFactory implements IFactory {
    @Override
    public Car getCar(CarModelTypes carModelTypes) {
        if(carModelTypes == CarModelTypes.FORD) {
            return new ElectricFord();
        } else if(carModelTypes == CarModelTypes.TOYOTA) {
            return new ElectricToyota();
        }
        return null;
    }
}
