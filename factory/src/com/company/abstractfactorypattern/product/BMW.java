package com.company.abstractfactorypattern.product;

import com.company.abstractfactorypattern.creator.EngineFactory;

public class BMW extends Car {
    private EngineFactory engineFactory;
    public BMW(EngineFactory engineFactory) {
        this.engineFactory = engineFactory;
        car = "BMW";
    }

    @Override
    public void initEngine() {
        engine = engineFactory.createEngine();
    }
}
