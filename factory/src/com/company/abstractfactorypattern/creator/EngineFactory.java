package com.company.abstractfactorypattern.creator;

import com.company.abstractfactorypattern.enums.EngineType;
import com.company.abstractfactorypattern.product.ElectricEngine;
import com.company.abstractfactorypattern.product.Engine;
import com.company.abstractfactorypattern.product.PetrolEngine;

public interface EngineFactory {
    Engine createEngine();

    static EngineFactory createEngineFactory(EngineType engineType) {
        if (engineType == EngineType.ELECTRIC) {
            return new ElectricEngineFactory();
        } else new PetrolEngineFactory();
    }
}
