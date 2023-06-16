package org.example;

public class Facade {
    private Subsystem1 subsystem1;
    private Subsystem2 subsystem2;

    public Facade() {
        subsystem1 = new Subsystem1();
        subsystem2 = new Subsystem2();
    }
    public void operation(){
        subsystem1.operation();
        subsystem2.operation();
    }
}
