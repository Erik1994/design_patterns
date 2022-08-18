package com.company.abstractfactorypattern.creator;

import com.company.abstractfactorypattern.product.Engine;
import com.company.abstractfactorypattern.product.PetrolEngine;
import com.company.abstractfactorypattern.product.Sony;
import com.company.abstractfactorypattern.product.Speaker;

public class BMWComponentFactory extends ComponentsFactory {
    @Override
    public Engine createEngine() {
        return new PetrolEngine();
    }

    @Override
    public Speaker createSpeaker() {
        return new Sony();
    }
}
