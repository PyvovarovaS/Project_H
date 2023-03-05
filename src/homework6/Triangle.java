package homework6;

public class Triangle {
    // fields
    double sideA;
    double sideB;
    double sideC;
    float angleA;
    float angleB;
    float angleC;

    // constructor
    public Triangle(double a, double b, float angleA) {
        this.sideA = a;
        this.sideB = b;
        this.angleA = angleA;
        this.sideC = Math.sqrt(sideA * sideA + sideB * sideB - 2 * sideA * sideB * Math.cos(Math.toRadians(angleA)));
        // обчислюємо третю сторону трикутника за формулою косінусів
    }
    public Triangle(double a, double b, double c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    // methods
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
    public double getAreaBySides() {
        // формула Герона для обчислення площі трикутника
        double s = getPerimeter() / 2; // змінна яка представляє півпериметр
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
    public double getAreaBySidesAndAngle() {
        // теорема обчислення площі трикутника
        return 0.5 * sideA * sideB * Math.sin(Math.toRadians(angleA));
    }

    // getters
    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public double getSideC() {
        return sideC;
    }
    public float getAngleA() {
        return angleA;
    }
    public float getAngleB() {
        return angleB;
    }
    public float getAngleC() {
        return angleC;
    }

    // setters
    public void setAngleA(float angleA){
        this.angleA = angleA;
    }

}
