package homework8.animal.Birds;

import homework8.Interfaces.Run;

public class Ostrich extends Bird implements Run {
    //constructor
    public Ostrich(String name, int age) {
        super(name, age);
    }

    //methods
    @Override
    public void move() {
    }
    @Override
    public void run() {
    }
    @Override
    public void makeSound() {
    }
    @Override
    public void eat() {
    }
}