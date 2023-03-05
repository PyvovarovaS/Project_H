package homework7;

public class RightTriangle extends Triangle {
    //fields
    private double sideB;

    //constructors
    public RightTriangle(String name, double sideA, double sideB) {
        super(name, sideA, calculateHeight(sideA, sideB));
        this.sideB = sideB;
    }
    public RightTriangle(String name, double sideA, double sideB, double height) {
        super(name, sideA, height);
        this.sideB = sideB;
    }

    //methods
    public double calculateHypotenuse() {
        return Math.sqrt(sideA * sideA + sideB * sideB);
    }
    public double calculateArea() {
        return 0.5 * sideA * height;
    }
    private static double calculateHeight(double sideA, double sideB) {
        return Math.sqrt(sideB * sideB - sideA * sideA / 4);
    }

    //getters and setters
    public double getSideB() {
        return sideB;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
        this.height = calculateHeight(sideA, sideB);
        this.area = calculateArea();
    }
}
