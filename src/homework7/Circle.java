package homework7;

public class Circle extends Figure{
    // fields
    private double radius;

    // constructors
    public Circle() {
        super();
    }
    public Circle(String name, double r) {
        super(name, 0);
        this.radius = r;
    }

    // methods
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // getters
    public double getRadius() {
        return radius;
    }

    // setters
    public void setRadius(double r) {
        this.radius = r;
    }
}
