package com.company;

import com.company.abstractfactorypattern.enums.CarModelTypes;
import com.company.abstractfactorypattern.enums.EngineType;
import com.company.abstractfactorypattern.factory.EngineFactory;
import com.company.abstractfactorypattern.ifactory.IFactory;
import com.company.factorypattern.enums.AnimalType;
import com.company.factorypattern.factory.AnimalFactory;
import com.company.factorypattern.ianimal.Animal;

public class Main {

    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal(AnimalType.CAT);
        animal.eat();

        IFactory engine = EngineFactory.getFactory(EngineType.ELECTRIC);
        engine.getCar(CarModelTypes.FORD).assemble();

    }
}
