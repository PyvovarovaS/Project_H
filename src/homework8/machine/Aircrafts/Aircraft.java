package homework8.machine.Aircrafts;

import homework8.machine.Machine;

public abstract class Aircraft extends Machine {
    //constructor
    public Aircraft(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    //methods
    public abstract void takeOff();
    public abstract void land();
}


