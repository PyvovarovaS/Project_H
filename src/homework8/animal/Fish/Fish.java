package homework8.animal.Fish;

import homework8.Interfaces.Swim;

public abstract class Fish {
    //fields
    protected String name;
    protected double length;
    protected double weight;

    //constructor
    public Fish(String name, double length, double weight) {
        this.name = name;
        this.length = length;
        this.weight = weight;
    }

    //getters
    public String getName() {
        return name;
    }
    public double getLength() {
        return length;
    }
    public double getWeight() { return weight; }
}



