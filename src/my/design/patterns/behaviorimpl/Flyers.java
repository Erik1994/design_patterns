package my.design.patterns.behaviorimpl;

import my.design.patterns.behavior.IFly;

public class Flyers implements IFly {
    @Override
    public void fly() {
        System.out.println("Can fly");
    }
}
