package homework8.animal;

public class Pike extends Fish implements FleshEating {
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