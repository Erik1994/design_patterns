package com.company.abstractfactorypattern.creator;

import com.company.abstractfactorypattern.product.ElectricEngine;
import com.company.abstractfactorypattern.product.Engine;

public class ElectricEngineFactory implements EngineFactory {
    @Override
    public Engine createEngine() {
        return new ElectricEngine();
    }
}