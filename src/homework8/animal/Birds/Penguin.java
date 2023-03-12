package homework8.animal.Birds;

import homework8.Interfaces.Swim;
import homework8.Interfaces.Walk;

public class Penguin extends Bird implements Swim, Walk {
    private String sound;

    //constructor
    public Penguin(String name, int age) {
        super(name, age);
    }

    //method
    @Override
    public void makeSound() {
    }
    @Override
    public void swim() {
    }
    @Override
    public void move() {
        swim();
    }
    @Override
    public void eat() {
    }
    @Override
    public void walk() {
    }
}