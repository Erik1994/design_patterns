package my.design.patterns.fisrtimpl.behaviorimpl;

import my.design.patterns.fisrtimpl.behavior.IRun;

public class Runners implements IRun {
    @Override
    public void run() {
        System.out.println("Can run");
    }
}
