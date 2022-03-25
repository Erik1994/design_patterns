package my.design.patterns.fisrtimpl.behaviorimpl;

import my.design.patterns.fisrtimpl.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Rubber duck squeaking implementation");
    }
}
