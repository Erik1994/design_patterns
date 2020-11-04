package my.design.patterns.behaviorimpl;

import my.design.patterns.behavior.ICreep;

public class NonCreepers implements ICreep {
    @Override
    public void creep() {
        System.out.println("Cannot creep");
    }
}
