package com.company.factorymethodpattern.secondimpl.creator;

import com.company.factorymethodpattern.secondimpl.enums.Model;
import com.company.factorymethodpattern.secondimpl.product.Car;
import com.company.factorymethodpattern.secondimpl.product.MercedesAutomate;
import com.company.factorymethodpattern.secondimpl.product.MercedesMechanical;

public class MercedesFactory extends CarFactory {
    @Override
    public Car createCar(Model model) {
        switch (model) {
            case AUTOMATE: return new MercedesAutomate();
            case MECHANICAL: return new MercedesMechanical();
        }
        return null;
    }
}
