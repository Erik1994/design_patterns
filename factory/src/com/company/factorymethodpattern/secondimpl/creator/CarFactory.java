package com.company.factorymethodpattern.secondimpl.creator;

import com.company.factorymethodpattern.secondimpl.enums.Model;
import com.company.factorymethodpattern.secondimpl.product.Car;

public abstract class CarFactory {
    public abstract Car createCar(Model model);
}
