package homework3;

import java.util.Scanner;

public class HW_3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вкажіть число:");
        int userNumber = scan.nextInt(); //число для перевірки
        if ((userNumber % 2) == 0) {
            System.out.println("Введене число парне.");
        } else {
            System.out.println("Введене число непарне.");
        }
        if (userNumber > 0) {
            System.out.println("Введене число додатнє.");
        } else {
            if (userNumber < 0) {
            System.out.println("Введене число від'ємне.");
            }
        }
        boolean NumberIsPrime = true;
        for (int i = 2; i < userNumber; i++) {
            if (userNumber % i == 0) {
            NumberIsPrime = false;
            break;
            }
        }
        if (NumberIsPrime) {
            System.out.println("Введене число просте.");
        } else {
            System.out.println("Введене число складене.");
        }
    }
}
