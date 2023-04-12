package homework7;

public class Triangle extends Figure {
    //fields
    protected double sideA;
    protected double height;

    //constructor
    public Triangle(String name, double sideA, double height) {
        super(name, 0);
        this.sideA = sideA;
        this.height = height;
        this.area = calculateArea();
    }

    //methods
    protected double calculateArea() {
        return 0.5 * sideA * height;
    }

    //getters
    public double getSideA() {
        return sideA;
    }
    public double getHeight() {
        return height;
    }
    public double getPerimeter() {
        return 2 * sideA + height;
    }
    public double getArea() {
        return area;
    }

    //setters
    public void setHeight(double height) {
        this.height = height;
    }
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
}

