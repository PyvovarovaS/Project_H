package homework8.animal.Pets;

import homework8.Interfaces.Pet;

public class Dog extends Mammal implements Pet {
    //constructor
    public Dog(String name, int age, String furColor) {
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
