package homework8.machine.Cars;

import homework8.Interfaces.Driving;

public class Tractor extends Vehicle implements Driving {
    //fields
    protected int cargoCapacity;
    protected boolean hasTrailer;

    //constructor
    public Tractor(String name, int maxSpeed, int cargoCapacity, boolean hasTrailer) {
        super(name, maxSpeed);
        this.cargoCapacity = cargoCapacity;
        this.hasTrailer = hasTrailer;
    }
    public Tractor(String name, int maxSpeed, int cargoCapacity) {
        super(name, maxSpeed);
        this.cargoCapacity = cargoCapacity;
    }

    //methods
    @Override
    public void moves() {
    }
    public void lifts() {
    }
    @Override
    public void drive() {
    }
}
