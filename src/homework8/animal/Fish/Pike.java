package homework8.animal.Fish;

import homework8.Interfaces.FleshEating;
import homework8.Interfaces.Swim;

public class Pike extends Fish implements Swim, FleshEating {
    //constructor
    public Pike(String name, double length, double weight) {
        super(name, length, weight);
    }

    //methods
    @Override
    public void swim() {
    }
    @Override
    public void hunt() {
    }
}