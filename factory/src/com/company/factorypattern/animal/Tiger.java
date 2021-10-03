package com.company.factorypattern.animal;

import com.company.factorypattern.ianimal.Animal;

public class Tiger implements Animal {

    @Override
    public void eat() {
        System.out.println("Tiger is eating...");
    }
}
