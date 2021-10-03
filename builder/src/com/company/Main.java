package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person.Builder("Ripa", "Ripa@gmail.com")
                .setAddress("London")
                .build();
        System.out.println(person);
    }
}
