package homework7;

public class EquilateralTriangle extends Triangle {
    //fields
    private double side;

    //constructor
    public EquilateralTriangle(String name, double side) {
        super(name, side, calculateHeight(side));
    }
    public EquilateralTriangle(String name, double side, double height) {
        super(name, side, height);
    }

    //methods
    private static double calculateHeight(double side) {
        return (Math.sqrt(3)/2)*side;
    }

    //getters and setters
    public double getSide() {
        return sideA;
    }
    public void setSide(double side) {
        this.sideA = side;
        this.height = (Math.sqrt(3)/2)*side;
        this.area = calculateArea();
    }
}
