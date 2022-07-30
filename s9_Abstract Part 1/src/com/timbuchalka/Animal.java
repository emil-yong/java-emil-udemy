package com.timbuchalka;

/**
 * Created by dev on 7/10/2015.
 * Can inherit from abstract class
 * BUt doesnt specify how it will perform
 * with abstract, we  are forcing the abstract class
 * to implement those methods
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
