package my.design.patterns.fisrtimpl.behaviorimpl;

import my.design.patterns.fisrtimpl.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Duck quacking implementation");
    }
}
