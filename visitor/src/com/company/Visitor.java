package com.company;


public interface Visitor {
    void visitCircle(Circle circle);
    void visitTriangle(Triangle triangle);
    void visitRectangle(Rectangle rectangle);
}
