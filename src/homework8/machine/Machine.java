package homework8.machine;

public abstract class Machine {
    //fields
    protected String name;
    protected int maxSpeed;

    //constructor
    public Machine(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    //methods
    public abstract void moves ();
}
