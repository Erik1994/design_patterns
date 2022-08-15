package com.company.factorymethodpattern.secondimpl.creator;

import com.company.factorymethodpattern.secondimpl.enums.Model;
import com.company.factorymethodpattern.secondimpl.product.*;

public class BMWFactory extends CarFactory {
    @Override
    public Car createCar(Model model) {
        switch (model) {
            case AUTOMATE: return new BMWAutomate();
            case MECHANICAL: return new BMWMechanical();
        }
        return null;
    }
}
