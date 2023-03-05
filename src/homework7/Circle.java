package homework7;

public class Circle extends Figure{
    // fields
    private double radius;

    // constructors
    public Circle() {
        super();
    }
    public Circle(double r) {
        this.radius = r;
    }

    // methods
    public double getArea() {
        return Math.PI * radius * radius;
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
