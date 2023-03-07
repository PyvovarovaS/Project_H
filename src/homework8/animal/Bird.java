package homework8.animal;

public abstract class Bird extends Animal {
    //constructor
    public Bird(String name, int age) {
        super(name, age);
    }

    //method
    public abstract void move();
}
