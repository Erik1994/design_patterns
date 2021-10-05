package com.company;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    //we will create a rectangle for every color
    private Map<String, Shape> shapeMap;

    public ShapeFactory() {
        shapeMap = new HashMap<>();
    }

    public Shape getShape(String color) {
        if(shapeMap.containsKey(color)) {
            return shapeMap.get(color);
        }

        Shape shape = new Rectangle(color);
        shapeMap.put(color, shape);
        return shape;
    }
}
