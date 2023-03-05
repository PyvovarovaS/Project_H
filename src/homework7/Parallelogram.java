package homework7;

public class Parallelogram extends Quadrangle{
    //fields
    private double base;
    private double height;

    // constructors
    public Parallelogram() {
        super();
    }
    public Parallelogram(String name, double area, double side1, double side2, double side3, double side4,
                         double base, double height) {
        super(name, area, side1, side2, side3, side4);
        this.base = base;
        this.height = height;
    }
    // methods
    public double calculateArea() {
        return base * height;
    }

    //getters
    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }

    //setters
    public void setBase(double base) {
        this.base = base;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}
