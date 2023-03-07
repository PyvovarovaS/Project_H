package homework8.animal;

public class Catfish extends Fish implements FleshEating {
    //constructor
    public Catfish(String name, double length, double weight) { super(name, length, weight); }

    //methods
    @Override
    public void swim() {
    }
    @Override
    public void hunt() {
    }
}