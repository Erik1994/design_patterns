package com.company.abstractfactorypattern.creator;

import com.company.abstractfactorypattern.product.ElectricEngine;
import com.company.abstractfactorypattern.product.Engine;
import com.company.abstractfactorypattern.product.Jbl;
import com.company.abstractfactorypattern.product.Speaker;

public class TeslaComponentFactory extends ComponentsFactory {
    @Override
    public Engine createEngine() {
        return new ElectricEngine();
    }

    @Override
    public Speaker createSpeaker() {
        return new Jbl();
    }
}
