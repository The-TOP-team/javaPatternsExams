package org.example;

public class Main {
    /*Паттерн Абстрактная Фабрика предоставляет интерфейс для создания семейств
    взаимосвязанных или взаимозависимых объектов без указания их конкретных классов.*/
    public static void main(String[] args) {
        Application windows_application = new Application(new WinGUIFactory());
        Application mac_application = new Application(new MacGUIFactory());
        windows_application.createUI();
        windows_application.renderUI();
        mac_application.createUI();
        mac_application.renderUI();
    }
}