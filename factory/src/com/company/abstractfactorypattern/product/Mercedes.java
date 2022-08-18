package com.company.abstractfactorypattern.product;

import com.company.abstractfactorypattern.creator.EngineFactory;

public class Mercedes extends Car {
    private EngineFactory engineFactory;
    public Mercedes(EngineFactory engineFactory) {
        car = "Mercedes";
    }

    @Override
    public void initEngine() {
        engine = engineFactory.createEngine();
    }
}
