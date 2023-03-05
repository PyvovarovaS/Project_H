package homework7;

public class Trapezoid extends Quadrangle{
    //fields
    protected double base1;
    protected double base2;
    protected double height;

    //constructors
    public Trapezoid() {
        super();
    }
    public Trapezoid(String name, double area, double side1, double side2, double side3, double side4,
                     double base1, double base2, double height) {
        super(name, area, side1, side2, side3, side4);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    //methods
    public double calculateArea() {
        return (base1 + base2) * height / 2;
    }

    //getters
    public double getBase1() {
        return base1;
    }
    public double getBase2() {
        return base2;
    }
    public double getHeight() {
        return height;
    }

    //setters
    public void setBase1(double base1) {
        this.base1 = base1;
    }
    public void setBase2(double base2) {
        this.base2 = base2;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}