package homework8.animal.Birds;

import homework8.Interfaces.Swim;
import homework8.Interfaces.Walk;

public class Duck extends Bird implements Swim, Walk {
    //constructor
    public Duck(String name, int age) {
        super(name, age);
    }

    //methods
    @Override
    public void makeSound() {
    }
    public void fly() {
    }
    @Override
    public void swim() {
    }
    @Override
    public void move() {
        if (Math.random() < 0.5) {
            swim();
        } else {
            fly();
        }
    }
    @Override
    public void eat() {
    }
    @Override
    public void walk() {
    }
}