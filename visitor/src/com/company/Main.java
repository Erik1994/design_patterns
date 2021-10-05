package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Rectangle());

        Visitor visitor = new SaveCsvFile();
        for(Shape shape : shapes) {
            shape.accept(visitor);
        }
    }
}
