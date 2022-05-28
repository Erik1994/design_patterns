package my.design.patterns;

import my.design.patterns.fisrtimpl.baseaduck.Duck;
import my.design.patterns.fisrtimpl.behaviorimpl.*;
import my.design.patterns.fisrtimpl.concrateducks.DecoyDuck;
import my.design.patterns.secondimpl.manager.OperationManager;
import my.design.patterns.secondimpl.operation.Addition;

public class Main {

    public static void main(String[] args) {
        Duck decoyDuck = new DecoyDuck();
        decoyDuck.fly();
        decoyDuck.quack();
        decoyDuck.setQuackBehavior(new Squeak());
        decoyDuck.quack();

        OperationManager operationManager = new OperationManager();
        operationManager.setStrategy(new Addition());
        System.out.println(operationManager.execute(7,9));
    }
}
