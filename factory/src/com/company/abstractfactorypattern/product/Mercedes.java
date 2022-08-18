package com.company.abstractfactorypattern.product;

import com.company.abstractfactorypattern.creator.ComponentsFactory;

public class Mercedes extends Car {
    private ComponentsFactory componentsFactory;
    public Mercedes(ComponentsFactory componentsFactory) {
        this.componentsFactory = componentsFactory;
        car = "Mercedes";
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
