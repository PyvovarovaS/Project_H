package homework8.machine.Cars;

import homework8.Interfaces.Driving;

public class Bus extends Vehicle implements Driving {
    //fields
    private int numPassengers;

    //constructor
    public Bus(String name, int maxSpeed, int numPassengers) {
        super(name, maxSpeed);
        this.numPassengers = numPassengers;
    }

    //method
    @Override
    public void moves() {
    }
    @Override
    public void drive() {
    }
}
