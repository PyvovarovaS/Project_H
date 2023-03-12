package homework8.animal.Birds;

import homework8.Interfaces.Fly;
import homework8.animal.Animal;

public class Eagle extends Animal implements Fly {
    //constructor
    public Eagle(String name, int age) {
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
}