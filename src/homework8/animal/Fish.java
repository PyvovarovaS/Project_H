package homework8.animal;

public abstract class Fish{
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

    //method
    public abstract void swim();

    //getters
    public String getName() {
        return name;
    }
    public double getLength() {
        return length;
    }
    public double getWeight() { return weight; }
}



