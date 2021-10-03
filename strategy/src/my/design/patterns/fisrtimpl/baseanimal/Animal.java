package my.design.patterns.fisrtimpl.baseanimal;

import my.design.patterns.fisrtimpl.behavior.ICreep;
import my.design.patterns.fisrtimpl.behavior.IFly;
import my.design.patterns.fisrtimpl.behavior.IRun;

public class Animal {
    private IRun run;
    private IFly fly;
    private ICreep creep;

    public Animal(IRun run, IFly fly, ICreep creep) {
        this.run = run;
        this.creep = creep;
        this.fly = fly;
    }

    public void fly() {
        fly.fly();
    }

    public void creep() {
        creep.creep();
    }

    public void run() {
        run.run();
    }

}
