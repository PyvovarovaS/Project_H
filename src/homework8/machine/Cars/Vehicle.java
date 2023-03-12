package homework8.machine.Cars;

import homework8.machine.Machine;

public abstract class Vehicle extends Machine {
    //fields
    protected String name;
    protected int maxSpeed;

    //constructor
    public Vehicle(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    //method
    @Override
    public abstract void moves ();
}