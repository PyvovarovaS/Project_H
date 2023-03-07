package homework8.animal;

public class Carp extends Fish implements PlantEating {
    //constructor
    public Carp(String name, double length, double weight) {
        super(name, length, weight);
    }

    //methods
    @Override
    public void swim() {
    }
    @Override
    public void feed() {
    }
}