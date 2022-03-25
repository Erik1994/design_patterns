package my.design.patterns.fisrtimpl.behaviorimpl;

import my.design.patterns.fisrtimpl.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Can't quack");
    }
}
