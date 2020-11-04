package my.design.patterns;

import my.design.patterns.baseanimal.Animal;
import my.design.patterns.behaviorimpl.*;

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
    }
}
