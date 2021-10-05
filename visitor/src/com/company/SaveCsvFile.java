package com.company;

public class SaveCsvFile implements Visitor {
    @Override
    public void visitCircle(Circle circle) {
        System.out.println("Saving Circle...");
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        System.out.println("Saving Triangle...");
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        System.out.println("Saving Rectangle...");
    }
}
