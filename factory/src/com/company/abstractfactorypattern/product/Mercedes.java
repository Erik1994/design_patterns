package com.company.abstractfactorypattern.product;

import com.company.abstractfactorypattern.creator.EngineFactory;

public class Mercedes extends Car {
    private EngineFactory engineFactory;
    public Mercedes(EngineFactory engineFactory) {

        car = "Mercedes";
    }

    @Override
    void initEngine() {
        engine = engineFactory.createEngine();
    }
}
