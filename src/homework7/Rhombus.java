package homework7;

public class Rhombus extends Quadrangle{
    //fields
    private double diagonal1;
    private double diagonal2;

    // constructors
    public Rhombus() {
        super();
    }
    public Rhombus(String name, double area, double side1, double side2, double side3, double side4,
                   double diagonal1, double diagonal2) {
        super(name, area, side1, side2, side3, side4);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    // methods
    public double calculateArea() {
        return (diagonal1 * diagonal2) / 2;
    }
    public double calculatePerimeter() {
        return 4 * side1;
    }
    public boolean isSquare() {
        return side1 == side2 && side2 == side3 && side3 == side4;
    }

    // getters
    public double getDiagonal1() {
        return diagonal1;
    }
    public double getDiagonal2() {
        return diagonal2;
    }

    //setters
    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }
    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }
}
