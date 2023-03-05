package homework7;

public class Rectangle extends Quadrangle{
    //fields
    private double width;
    private double height;

    //constructors
    public Rectangle() {
        super();
    }
    public Rectangle(String name, double area, double side1, double side2, double side3, double side4,
                     double width, double height) {
        super(name, area, side1, side2, side3, side4);
        this.width = width;
        this.height = height;
    }

    //methods
    public double calculateArea() {
        return width * height;
    }
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    //getters
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

    //setters
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}
