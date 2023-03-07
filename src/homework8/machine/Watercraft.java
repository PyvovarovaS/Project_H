package homework8.machine;

public abstract class Watercraft extends Machine {
    //fields
    protected double displacement;

    //constructor
    public Watercraft(String name, int maxSpeed, double displacement) {
        super(name, maxSpeed);
        this.displacement = displacement;
    }

    //method
    public abstract void navigate();
}
