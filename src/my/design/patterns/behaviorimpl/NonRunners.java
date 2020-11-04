package my.design.patterns.behaviorimpl;

import my.design.patterns.behavior.IRun;

public class NonRunners implements IRun {
    @Override
    public void run() {
        System.out.println("Cannot run");
    }
}
