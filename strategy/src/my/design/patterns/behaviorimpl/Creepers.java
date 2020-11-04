package my.design.patterns.behaviorimpl;

import my.design.patterns.behavior.ICreep;

public class Creepers implements ICreep {
    @Override
    public void creep() {
        System.out.println("Can creep");
    }
}
