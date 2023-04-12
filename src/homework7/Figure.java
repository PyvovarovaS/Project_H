package homework7;

public abstract class Figure implements Comparable<Figure>{
    protected String name;
    protected double area;
    protected double perimeter;

    // constructors
    public Figure() {
        super();
    }
    public Figure(String name, double area) {
        this.name = name;
        this.area = area;
    }
    public Figure(String name, double area, double perimeter) {
        this.name = name;
        this.area = area;
        this.perimeter = perimeter;
    }
    @Override
    public int compareTo(Figure other) {
        return 0;
    }

    //getters
    public String getName() {
        return name;
    }
    public double getArea() {
        return area;
    }
    public double getPerimeter() {
        return perimeter;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

}
