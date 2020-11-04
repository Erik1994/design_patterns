package my.design.patterns.behaviorimpl;

import my.design.patterns.behavior.IRun;

public class Runners implements IRun {
    @Override
    public void run() {
        System.out.println("Can run");
    }
}
