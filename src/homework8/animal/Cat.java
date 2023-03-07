package homework8.animal;

public class Cat extends Mammal implements Pet {
    //constructor
    public Cat(String name, int age, String furColor) {
        super(name, age, furColor);
    }

    //methods
    @Override
    public void makeSound() {
    }

    public void move() {
    }
    public void eat() {
    }
    @Override
    public void play() {
    }
    @Override
    public void beFriendly() {
    }
    public void markTerritory() {
    }
}