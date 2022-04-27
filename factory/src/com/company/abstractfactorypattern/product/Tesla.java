package com.company.abstractfactorypattern.product;

import com.company.abstractfactorypattern.creator.EngineFactory;

public class Tesla extends Car {
    private EngineFactory engineFactory;
    public Tesla(EngineFactory engineFactory) {
        this.engineFactory = engineFactory;
        car = "Tesla";
    }

    @Override
    void initEngine() {
        engine = engineFactory.createEngine();
    }
}
