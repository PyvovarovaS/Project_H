package homework8.machine;

public class Car extends Vehicle implements Driving{
    //fields
    private int numSeats;

    //constructor
    public Car(String name, int maxSpeed, int numSeats) {
        super(name, maxSpeed);
        this.numSeats = numSeats;
    }

    //method
    @Override
    public void moves() {
    }
    @Override
    public void drive() {
    }
}
