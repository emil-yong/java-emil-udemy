package com.timbuchalka;

public class Main {
/*
 * Interface are purely abstract and they dont specify any acutal
 * aspect of the implementation.
 * The actual implementation is left for the class
 * which is why we use the word "IMPLEMENT"
 * Interface  : " What to be done "
 * Class : " How is it done "
 */
    public static void main(String[] args) {
	    Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
