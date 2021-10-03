package com.company.abstractfactorypattern.factory;

import com.company.abstractfactorypattern.enums.EngineType;
import com.company.abstractfactorypattern.ifactory.IFactory;

public class EngineFactory {
    public static IFactory getFactory(EngineType engineType) {
        if(engineType == EngineType.ELECTRIC) {
            return new ElectricFactory();
        } else if(engineType == EngineType.PATROL) {
            return new PatrolFactory();
        }
        return null;
    }
}
