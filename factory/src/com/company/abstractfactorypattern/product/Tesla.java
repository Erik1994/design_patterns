package com.company.abstractfactorypattern.product;

import com.company.abstractfactorypattern.creator.ComponentsFactory;

public class Tesla extends Car {
    private ComponentsFactory componentsFactory;
    public Tesla(ComponentsFactory componentsFactory) {
        this.componentsFactory = componentsFactory;
        car = "Tesla";
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
