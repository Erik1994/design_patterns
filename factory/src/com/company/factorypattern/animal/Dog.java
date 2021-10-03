package com.company.factorypattern.animal;

import com.company.factorypattern.ianimal.Animal;

public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }
}
