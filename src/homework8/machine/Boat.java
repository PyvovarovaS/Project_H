package homework8.machine;

public class Boat extends Watercraft implements WaterMoving{
    //fields
    private int numSeats;

    //constructors
    public Boat(String name, int maxSpeed, double displacement, int numSeats) {
        super(name, maxSpeed, displacement);
        this.numSeats = numSeats;
    }
    public Boat(String name, int maxSpeed, double displacement) {
        super(name, maxSpeed, displacement);
    }

    //method
    @Override
    public void navigate() {
    }
    @Override
    public void moves() {
    }
    @Override
    public void waterMove() {
    }
}
