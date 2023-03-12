package homework8.machine.Boats;

import homework8.machine.Machine;

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
