package my.design.patterns.fisrtimpl.behaviorimpl;

import my.design.patterns.fisrtimpl.behavior.IRun;

public class NonRunners implements IRun {
    @Override
    public void run() {
        System.out.println("Cannot run");
    }
}
