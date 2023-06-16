package org.example;

public class ConcreteBuilder extends Builder{
    public ConcreteBuilder() {
        product = new Product();
    }

    @Override
    public void buildPartA() {
        product.setPartA("part A");
    }

    @Override
    public void buildPartB() {
        product.setPartB("part B");
    }

    @Override
    public void buildPartC() {
        product.setPartC("part C");
    }
}
