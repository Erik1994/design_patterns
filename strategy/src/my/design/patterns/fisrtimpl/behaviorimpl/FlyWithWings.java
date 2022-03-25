package my.design.patterns.fisrtimpl.behaviorimpl;

import my.design.patterns.fisrtimpl.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
}
