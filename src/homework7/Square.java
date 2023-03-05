package homework7;

public class Square extends Quadrangle{
    // fields
    private double side;

    // constructors
    public Square() {
        super();
    }
    public Square(String name, double area, double side) {
        super(name, area, side, side, side, side);
        this.side = side;
    }

    // methods
    @Override
    public double getArea() {
        return side * side;
    }

    //getters and setters
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
        this.side1 = side;
        this.side2 = side;
        this.side3 = side;
        this.side4 = side;
    }
}