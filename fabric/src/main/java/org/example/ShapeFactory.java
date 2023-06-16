package org.example;

public class ShapeFactory {
    public Shape createShape(String type){
        if (type.equalsIgnoreCase("circle")) return new Circle();
        else if (type.equalsIgnoreCase("rectangle")) return new Rectangle();
        return null;
    }
}
