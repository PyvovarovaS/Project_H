package homework8.animal;

public class Stork extends Animal implements Fly, Walk {
    //constructor
    public Stork(String name, int age) {
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
