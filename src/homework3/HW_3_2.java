package homework3;

import java.util.Scanner;

public class HW_3_2 {
    public static void main(String[] args) {
        int price = Integer.parseInt(args[0]);
        Scanner scan = new Scanner(System.in);
        System.out.println("Вкажіть кількість товару, який хочете придбати:");
        int userNumber = scan.nextInt();
        int amount = 10; // мінімальна кількість товару
        double discount5 = 0.05; // знижка 5%
        double discount10 = 0.1; // знижка 10%
        double discount12 = 0.12; // знижка 12%
        double discount13 = 0.13; // знижка 13%
        double addDiscount = 0.004; // додаткова знижка 0,4%
        String sumWithTax = "Загальна сума товару зі знижкою: ";
        int cost = price * userNumber; // вартість товару з урахуванням кількості
        int amountIndex = (userNumber - amount * 3) / amount; // коефіціент кількості товару без перших 30
        amountIndex = Math.round(amountIndex);
        if (userNumber <= amount) {
            System.out.println("Загальна сума товару: " + cost);
        }
        else if (userNumber <= amount * 2) {
            System.out.println(sumWithTax + (cost - cost * discount5));
        }
        else if (userNumber <= amount * 3) {
            System.out.println(sumWithTax + (cost - cost * discount10));
        }
        else if (userNumber <= amount * 4) {
            System.out.println(sumWithTax + (cost - cost * discount12));
        }
        else if (userNumber <= amount * 8) {
            System.out.println(sumWithTax + (cost - cost *
            (discount12 + addDiscount * amountIndex)));
        }
        else {
            System.out.println(sumWithTax + (cost - cost * discount13));
        }
    }
}
