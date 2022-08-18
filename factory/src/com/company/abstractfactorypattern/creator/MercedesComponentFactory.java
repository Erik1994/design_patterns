package com.company.abstractfactorypattern.creator;

import com.company.abstractfactorypattern.product.*;

public class MercedesComponentFactory extends ComponentsFactory {
    @Override
    public Engine createEngine() {
        return new PetrolEngine();
    }

    @Override
    public Speaker createSpeaker() {
        return new HamranKardon();
    }
}
