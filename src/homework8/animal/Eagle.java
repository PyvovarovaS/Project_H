package homework8.animal;

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