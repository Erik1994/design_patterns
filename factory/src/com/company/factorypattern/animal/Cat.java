package com.company.factorypattern.animal;

import com.company.factorypattern.ianimal.Animal;

public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("Cat is eating...");
    }
}
