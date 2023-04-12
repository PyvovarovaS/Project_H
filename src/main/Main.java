package main;

import homework6.Product;
import homework6.Employee;
import homework6.Triangle;
import homework6.Credit;
import homework7.Circle;
import homework9.Size;

public class Main {
    public static void main(String[] args) {
       //додаємо новий продукт класу Product
       Product smartphone = new Product("iPhone 11", 235647,14499.99,
               "Pro, 256 Gb, color Green", true);
          System.out.println(smartphone.getTitle());
          System.out.println(smartphone.getItemNumber());
          System.out.println(smartphone.getPrice());
          System.out.println(smartphone.getDescription());
          System.out.println(smartphone.isAvailable());

       //додаємо нового співробітника класу Employee
       Employee developer = new Employee("Johnson", "Boris", "Frontend Developer",
               15);
        System.out.println(developer.getFullName());
        System.out.println(developer.getPosition());
        System.out.println(developer.getRatePerHour());

       //додаємо новий трикутний класу Triangle
       Triangle randomTriangle = new Triangle(30.0, 50.0, 45);
        System.out.printf("%.2f\n", randomTriangle.getPerimeter());
        System.out.printf("%.2f\n", randomTriangle.getAreaBySidesAndAngle());
        System.out.printf("%.2f\n", randomTriangle.getAreaBySides());

        //додаємо новий кредит класу Credit
       Credit yearlyCredit = new Credit(1000, 0.05, 100, 12);
        System.out.println(yearlyCredit.getMonthlyPayment());
        System.out.println(yearlyCredit.getPaymentTerm());
        System.out.println(yearlyCredit.getRemainingBalance());

        //додаємо дошку для торту, наслідуючи клас Circle
        Circle newCircle = new Circle("Circle", 30);
        System.out.println(newCircle.getRadius());
    }
}
