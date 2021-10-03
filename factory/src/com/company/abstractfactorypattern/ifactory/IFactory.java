package com.company.abstractfactorypattern.ifactory;

import com.company.abstractfactorypattern.enums.CarModelTypes;
import com.company.abstractfactorypattern.icar.Car;

public interface IFactory {
    Car getCar(CarModelTypes carModelTypes);
}
