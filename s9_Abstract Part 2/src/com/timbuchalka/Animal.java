package com.timbuchalka;

/**
 * Created by dev on 7/10/2015.
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    /* Becos most of the animal will eat and breathe
     * it is advisible to put them in this base class
     * as abstract method
     * 
     * 
     * RMB: Abstract class can have member variable that are inherited
     * something that cant be done in interface
     * Interface can have variable but they are all public
     * static final variable.
     * 
     * All interface are automatically public
     * but abstract class can have any visibility
     */
    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
