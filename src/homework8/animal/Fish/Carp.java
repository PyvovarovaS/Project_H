package homework8.animal.Fish;

import homework8.Interfaces.PlantEating;
import homework8.Interfaces.Swim;

public class Carp extends Fish implements Swim, PlantEating {
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