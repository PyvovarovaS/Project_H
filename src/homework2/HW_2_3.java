package homework2;

import java.util.Scanner;

public class HW_2_3 {
    public static void main(String[] args) {
        int weeksInMonth = 4; // кількість тижнів на місяць
        int monthsInYear = 12; // кількість місяців
        Scanner scan = new Scanner(System.in);
            System.out.println("Вкажіть кількість робочих годин на тиждень:");
        int hours = scan.nextInt(); // кількість робочих годин на тиждень
            System.out.println("Вкажіть річну зарплатню з податками:");
        int nettoYear = scan.nextInt(); // річна зарплатня з податками
            System.out.println("Вкажіть вісоток податку:");
        int tax = scan.nextInt(); // вісоток податку
        int bruttoYear = nettoYear * 100/(100 - tax); // річна зарплатня без податків
        int rate = bruttoYear/(hours * weeksInMonth * monthsInYear); // оплата за робочу годину
            System.out.println ("При " + hours + " робочих годин на тиждень з річною зарплатею в " +
            nettoYear + " та податком " + tax + "% година часу коштує " + rate);
    }
}
