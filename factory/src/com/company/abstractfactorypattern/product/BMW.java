package com.company.abstractfactorypattern.product;

import com.company.abstractfactorypattern.creator.ComponentsFactory;

public class BMW extends Car {
    private ComponentsFactory componentsFactory;
    public BMW(ComponentsFactory componentsFactory) {
        this.componentsFactory = componentsFactory;
        car = "BMW";
    }

    @Override
    public void initEngine() {
        engine = componentsFactory.createEngine();
    }

    @Override
    public void initSpeaker() {
        speaker = componentsFactory.createSpeaker();
    }
}
