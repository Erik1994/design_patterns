package com.company.abstractfactorypattern.creator;

import com.company.abstractfactorypattern.product.ElectricEngine;
import com.company.abstractfactorypattern.product.Engine;

public class ElectricEngineFactory extends EngineFactory {
    @Override
    public Engine createEngine() {
        return new ElectricEngine();
    }
}
