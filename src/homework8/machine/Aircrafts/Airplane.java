package homework8.machine.Aircrafts;

import homework8.Interfaces.Fly;

public class Airplane extends Aircraft implements Fly {
    //constructor
    public Airplane(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    //methods
    @Override
    public void takeOff() {
    }
    @Override
    public void land() {
    }
    @Override
    public void fly() {
    }
    @Override
    public void moves() {
    }
}