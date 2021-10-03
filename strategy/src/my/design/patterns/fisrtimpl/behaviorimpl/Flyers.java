package my.design.patterns.fisrtimpl.behaviorimpl;

import my.design.patterns.fisrtimpl.behavior.IFly;

public class Flyers implements IFly {
    @Override
    public void fly() {
        System.out.println("Can fly");
    }
}
