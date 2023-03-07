package homework8.animal;

public abstract class Animal {
    //fields
    protected String name;
    protected int age;

    //constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //methods
    public abstract void makeSound();
    public abstract void move();
    public abstract void eat();

    //getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

