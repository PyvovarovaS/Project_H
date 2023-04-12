package homework7;

public class Quadrangle extends Figure{
    //fields
    protected double side1;
    protected double side2;
    protected double side3;
    protected double side4;
    protected double semiPerimeter;

    // constructors
    public Quadrangle() {
        super();
    }
    public Quadrangle(String name, double area, double side1, double side2, double side3, double side4) {
        super(name, area);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
        this.area = calculateArea();
    }
    public Quadrangle(String name, double side1, double side2, double side3, double side4) {
        super(name, 0);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
        this.area = calculateArea();
    }

    // methods
    public double diagonal1() {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side3, 2));
    }
    public double diagonal2() {
        return Math.sqrt(Math.pow(side2, 2) + Math.pow(side4, 2));
    }
    public double semiPerimeter() {
        return perimeter / 2;
    }
    public double calculateArea() {
        return Math.sqrt((semiPerimeter - side1) * (semiPerimeter - side2) *
                (semiPerimeter - side3) * (semiPerimeter - side4));
    }

    // getters
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }
    public double getSide4() {
        return side4;
    }
    public double getPerimeter() {
        return side1 + side2 + side3 + side4;
    }
    public double getArea() {
        return area;
    }

    //setters
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public void setSide4(double side4) {
        this.side4 = side4;
    }
}
