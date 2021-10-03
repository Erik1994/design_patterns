package com.company.abstractfactorypattern.car;

import com.company.abstractfactorypattern.icar.Car;

public class PatrolFord implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling an patrol Ford...");
    }
}
