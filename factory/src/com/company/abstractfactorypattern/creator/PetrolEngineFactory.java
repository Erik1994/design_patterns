package com.company.abstractfactorypattern.creator;

import com.company.abstractfactorypattern.product.Engine;
import com.company.abstractfactorypattern.product.PetrolEngine;

public class PetrolEngineFactory implements EngineFactory{
    @Override
    public Engine createEngine() {
        return new PetrolEngine();
    }
}
