package homework7;

public class Figure {
    protected String name;
    protected double area;

    // constructors
    public Figure() {
        super();
    }
    public Figure(String name, double area) {
        this.name = name;
        this.area = area;
    }

    //getters
    public String getName() {
        return name;
    }
    public double getArea() {
        return area;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

}
