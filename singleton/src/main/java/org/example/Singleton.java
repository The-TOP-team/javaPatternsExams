package org.example;

public class Singleton {
    private String name;
    private static Singleton instance;

    private Singleton(String value){
        this.name = value;
    }

    public String getName() {
        return name;
    }

    public static Singleton getInstance(String value){
        if (instance==null) instance = new Singleton(value);
        return instance;
    }
}
