package my.design.patterns.fisrtimpl.behaviorimpl;

import my.design.patterns.fisrtimpl.behavior.ICreep;

public class Creepers implements ICreep {
    @Override
    public void creep() {
        System.out.println("Can creep");
    }
}
