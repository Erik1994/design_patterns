package my.design.patterns.fisrtimpl.behaviorimpl;

import my.design.patterns.fisrtimpl.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Can't fly");
    }
}
