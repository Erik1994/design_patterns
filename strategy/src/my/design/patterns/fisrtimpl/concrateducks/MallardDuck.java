package my.design.patterns.fisrtimpl.concrateducks;

import my.design.patterns.fisrtimpl.baseaduck.Duck;
import my.design.patterns.fisrtimpl.behaviorimpl.FlyWithWings;
import my.design.patterns.fisrtimpl.behaviorimpl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck");
    }
}
