package homework12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import homework7.Figure;
import homework7.Triangle;
import homework7.Circle;
import homework7.IsoscelesTriangle;
import homework7.Quadrangle;

public class FigureSorting {
    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean addAnotherFigure = true;

        while (addAnotherFigure) {
            System.out.println("""
                    Select the number of the figure to be added:
                    1) Triangle
                    2) Circle
                    3) Isosceles Triangle
                    4) Quadrangle""");
            int figureChoice = scanner.nextInt();
            scanner.nextLine();

            switch (figureChoice) {
                case 1:
                    System.out.println("Enter the length of the side and the height:");
                    String nameT = "Triangle";
                    double sideT = scanner.nextDouble();
                    double heightT = scanner.nextDouble();
                    figures.add(new Triangle(nameT, sideT, heightT));
                    break;
                case 2:
                    System.out.println("Enter the radius of the circle:");
                    String nameC = "Circle";
                    double radius = scanner.nextDouble();
                    figures.add(new Circle(nameC, radius));
                    break;
                case 3:
                    System.out.println("Enter the lengths of two sides and the height of an isosceles triangle:");
                    String nameIT = "IsoscelesTriangle";
                    double sideAIT = scanner.nextDouble();
                    double sideBIT = scanner.nextDouble();
                    double heightIT = scanner.nextDouble();
                    figures.add(new IsoscelesTriangle(nameIT, sideAIT, sideBIT, heightIT));
                    break;
                case 4:
                    System.out.println("Enter the lengths of the sides of the quadrangle:");
                    String nameQ = "Quadrangle";
                    double side1 = scanner.nextDouble();
                    double side2 = scanner.nextDouble();
                    double side3 = scanner.nextDouble();
                    double side4 = scanner.nextDouble();
                    figures.add(new Quadrangle(nameQ, side1, side2, side3, side4));
                    break;
                default:
                    System.out.println("Wrong choice.");
            }

            System.out.println("Do you want to add another figure? (yes/no)");
            String addAnotherFigureChoice = scanner.next();
            addAnotherFigure = addAnotherFigureChoice.equals("yes");
            scanner.nextLine();
        }

        Collections.sort(figures);

        // виводимо список фігур
        System.out.println("============= Figure list: =============");
        for (int i = 0; i < figures.size(); i++) {
            Figure figure = figures.get(i);
            System.out.printf("%d. [%s]: Square = %.2f Perimeter = %.2f\n", i + 1, figure.getName(),
                    figure.getArea(), figure.getPerimeter());
        }
    }
}
