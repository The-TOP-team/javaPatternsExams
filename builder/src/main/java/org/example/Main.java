package org.example;

public class Main {
    /*Паттерн Строитель позволяет создавать сложные объекты пошагово.
    Клиентский код указывает только тип и порядок шагов, а строитель выполняет создание объекта.*/
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.getProduct();
        product.show();
    }
}