package com.company;

public class NameRepository {
    private String[] names = {"Ripa", "Ripka", "Rippka", "Ripkka"};

    public Iterator getIterator() {
        return new NameIterator(names);
    }
}
