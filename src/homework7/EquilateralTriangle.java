package homework7;

public class EquilateralTriangle extends Triangle {
    //fields
    private double side;

    //constructor
    public EquilateralTriangle(String name, double side) {
        super(name, side, calculateHeight(side));
        this.side = side;
    }
    public EquilateralTriangle(String name, double side, double height) {
        super(name, side, height);
        this.side = side;
    }

    //methods
    private static double calculateHeight(double side) {
        return (Math.sqrt(3) / 2) * side;
    }

    //getters and setters
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
        this.sideA = side;
        this.height = calculateHeight(side);
        this.area = calculateArea();
    }
}
