package org.example;

public class Main {
    /*Паттерн Фабрика определяет интерфейс для создания объектов, но позволяет подклассам решить, какой класс инстанцировать.
     Таким образом, Фабрика делегирует создание объектов подклассам.*/
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.createShape("circle");
        Shape rectangle = factory.createShape("rectangle");
        circle.draw();
        rectangle.draw();
    }
}