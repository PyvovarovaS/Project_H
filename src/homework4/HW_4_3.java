package homework4;

import java.util.Scanner;

public class HW_4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вкажіть загальну суму кредиту:");
        double totalCredit = scan.nextInt(); // загальна сума кредиту
        System.out.println("Вкажіть місячний відсоток на залишок по кредиту:");
        double creditPercent = scan.nextInt();
        creditPercent = creditPercent / 100; // відсоток на залишок по кредиту
        double monthsToPay = 0;
        double monthlyPayment; // щомісячний платіж
        System.out.print("""
                Оберіть один з варіантів:
                1) Розрахувати кількість щомісячних платежів, які необхідно зробити для повного погашення кредиту.
                2) Розрахувати суму щомісячного платежу.
                """);
        int option = scan.nextInt();
        if (option == 1) {
            System.out.println("Вкажіть суму щомісячного взносу:");
            monthlyPayment = scan.nextInt();
            while (totalCredit > 0) {
                totalCredit -= monthlyPayment;
                totalCredit += totalCredit * creditPercent;
                monthsToPay ++;
            }
            System.out.println("Кількість платежів до повного погашення кредиту: " +
            String.format("%.0f", monthsToPay));
        }
        else if (option == 2) {
            System.out.println("Вкажіть кількість платежів:");
            int paymentsNumber = scan.nextInt();
            double payPerMonth = 0; // сума місячного платіжу
            double remainingBalance = totalCredit; // залишок по кредиту
            int months = 0; // лічильник сплачених місяців
            while (months < paymentsNumber && remainingBalance > 0) {
                remainingBalance += remainingBalance * creditPercent;
                payPerMonth = remainingBalance / (paymentsNumber - months);
                remainingBalance -= payPerMonth;
                months++;
            }
            System.out.println("Сума щомісячного платежу: " + String.format("%.2f", payPerMonth));
        }
    }
}
