package com.company.abstractfactorypattern.creator;

import com.company.abstractfactorypattern.product.Engine;
import com.company.abstractfactorypattern.product.Speaker;

public abstract class ComponentsFactory {
    public abstract Engine createEngine();
    public abstract Speaker createSpeaker();
}
