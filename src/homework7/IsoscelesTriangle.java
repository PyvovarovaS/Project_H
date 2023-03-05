package homework7;

public class IsoscelesTriangle extends Triangle{
    //fields
    private double sideB;

    //constructors
    public IsoscelesTriangle(String name, double sideA, double height, double sideB) {
        super(name, sideA, height);
        this.sideB = sideB;
    }
    public IsoscelesTriangle(String name, double sideA, double height) {
        super(name, sideA, height);
        this.sideB = sideA;
    }

    //methods
    public double calculateArea() {
        double base = (sideB == sideA) ? sideA : 2 * Math.sqrt(Math.pow(sideA / 2, 2) + Math.pow(height, 2));
        return 0.5 * base * height;
    }

    //getters and setters
    public double getSideB() {
        return sideB;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
        this.area = calculateArea();
    }
}
