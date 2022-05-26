package my.design.patterns.fisrtimpl.concrateducks;

import my.design.patterns.fisrtimpl.baseaduck.Duck;
import my.design.patterns.fisrtimpl.behaviorimpl.FlyNoWay;
import my.design.patterns.fisrtimpl.behaviorimpl.FlyWithWings;
import my.design.patterns.fisrtimpl.behaviorimpl.Quack;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("RubberDuck");
    }
}
