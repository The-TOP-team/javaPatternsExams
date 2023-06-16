package org.example;

public class Main {

    /*Паттерн Фасад предоставляет унифицированный интерфейс для набора интерфейсов в подсистеме.
    Фасад скрывает сложность системы и предоставляет упрощенный доступ к ее функциональности.*/
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operation();
    }
}