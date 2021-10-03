package my.design.patterns;

import my.design.patterns.fisrtimpl.baseanimal.Animal;
import my.design.patterns.fisrtimpl.behaviorimpl.*;
import my.design.patterns.secondimpl.manager.OperationManager;
import my.design.patterns.secondimpl.operation.Addition;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal(new Runners(), new NonFlyers(), new NonCreepers());
        Animal bird = new Animal(new Runners(), new Flyers(), new NonCreepers());
        Animal snake = new Animal(new NonRunners(), new NonFlyers(), new Creepers());
        System.out.print("Dog: ");
        dog.run();
        dog.fly();
        dog.creep();
        System.out.println();
        System.out.print("Bird: ");
        bird.run();
        bird.fly();
        bird.creep();
        System.out.println();
        System.out.print("Snake: ");
        snake.run();
        snake.fly();
        snake.creep();
        System.out.println();


        OperationManager operationManager = new OperationManager();
        operationManager.setStrategy(new Addition());
        System.out.println(operationManager.execute(7,9));
    }
}
