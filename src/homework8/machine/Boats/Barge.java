package homework8.machine.Boats;

import homework8.Interfaces.Motorized;
import homework8.Interfaces.WaterMoving;

public class Barge extends Watercraft implements WaterMoving, Motorized {
    //fields
    protected int cargoCapacity;
    protected boolean hasTrailer;

    //constructors
    public Barge(String name, int maxSpeed, double displacement, int cargoCapacity, boolean hasTrailer) {
        super(name, maxSpeed, displacement);
        this.cargoCapacity = cargoCapacity;
        this.hasTrailer = hasTrailer;
    }
    public Barge(String name, int maxSpeed, double displacement, int cargoCapacity) {
        super(name, maxSpeed, displacement);
        this.cargoCapacity = cargoCapacity;
    }

    //methods
    @Override
    public void navigate() {
    }
    @Override
    public void moves() {
    }
    public void transports() {
    }
    @Override
    public void startMotor() {
    }
    @Override
    public void stopMotor() {
    }
    @Override
    public void waterMove() {
    }
}