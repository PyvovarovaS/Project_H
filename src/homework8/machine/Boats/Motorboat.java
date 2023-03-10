package homework8.machine.Boats;

import homework8.Interfaces.Motorized;
import homework8.Interfaces.WaterMoving;

public class Motorboat extends Boat implements WaterMoving, Motorized {
    //fields
    private int numPassengers;

    //constructor
    public Motorboat(String name, int maxSpeed, double displacement, int numPassengers) {
        super(name, maxSpeed, displacement);
        this.numPassengers = numPassengers;
    }

    //methods
    @Override
    public void startMotor() {
    }
    @Override
    public void stopMotor() {
    }
    @Override
    public void moves() {
    }
    @Override
    public void waterMove() {
    }
}
