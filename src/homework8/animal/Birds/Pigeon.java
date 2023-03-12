package homework8.animal.Birds;

import homework8.Interfaces.Fly;
import homework8.Interfaces.Walk;
import homework8.animal.Animal;

public class Pigeon extends Animal implements Fly, Walk {
    //constructor
    public Pigeon(String name, int age) {
        super(name, age);
    }

    //methods
    @Override
    public void makeSound() {
    }
    @Override
    public void move() {
        fly();
    }
    @Override
    public void eat() {
    }
    @Override
    public void fly() {
    }
    @Override
    public void walk() {
    }
}
