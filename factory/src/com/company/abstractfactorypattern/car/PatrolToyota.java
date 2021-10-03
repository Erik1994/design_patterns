package com.company.abstractfactorypattern.car;

import com.company.abstractfactorypattern.icar.Car;

public class PatrolToyota implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling an patrol Toyota...");
    }
}
