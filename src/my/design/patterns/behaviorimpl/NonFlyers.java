package my.design.patterns.behaviorimpl;

import my.design.patterns.behavior.IFly;

public class NonFlyers implements IFly {
    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }
}
