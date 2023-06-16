package org.example;

public class Main {
    /*Паттерн Синглтон гарантирует, что у класса есть только один экземпляр,
     и предоставляет глобальную точку доступа к этому экземпляру.*/
    public static void main(String[] args) {
        Singleton object1 = Singleton.getInstance("test1");
        Singleton object2 = Singleton.getInstance("test2");
        System.out.println(object1.getName());
        System.out.println(object2.getName());
    }
}