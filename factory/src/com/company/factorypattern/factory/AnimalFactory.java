package com.company.factorypattern.factory;

import com.company.factorypattern.ianimal.Animal;
import com.company.factorypattern.enums.AnimalType;
import com.company.factorypattern.animal.Cat;
import com.company.factorypattern.animal.Dog;
import com.company.factorypattern.animal.Tiger;

public class AnimalFactory {
    public static Animal getAnimal(AnimalType animal) {
        if(animal == AnimalType.CAT) {
            return new Cat();
        } else if(animal == AnimalType.DOG) {
            return new Dog();
        } else if (animal == AnimalType.TIGER) {
            new Tiger();
        }
        return null;
    }
}
