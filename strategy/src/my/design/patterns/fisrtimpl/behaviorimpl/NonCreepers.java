package my.design.patterns.fisrtimpl.behaviorimpl;

import my.design.patterns.fisrtimpl.behavior.ICreep;

public class NonCreepers implements ICreep {
    @Override
    public void creep() {
        System.out.println("Cannot creep");
    }
}
