package homework3;

public class HW_3_3 {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        double rate = Integer.parseInt(args[1]);
        int taxPercent = Integer.parseInt(args[2]);
        int weeksInMonth = 4; // кількість тижнів у місяці
        int weekends = weeksInMonth * 2; // кількість вихідних днів на місяць
        double salary31Day = rate * (31 - weekends); // Зарплатня за місяць (31 день)
        double salary30Day = rate * (30 - weekends); // Зарплатня за місяць (30 днів)
        double salary28Day = rate * (28 - weekends); // Зарплатня за місяць (28 днів)
        double salary31WithTax = salary31Day - salary31Day * taxPercent/100;
        // Зарплатня за місяць з податком (31 день)
        double salary30WithTax = salary30Day - salary30Day * taxPercent/100;
        // Зарплатня за місяць з податком (30 днів)
        double salary28WithTax = salary28Day - salary28Day * taxPercent/100;
        // Зарплатня за місяць з податком (28 днів)
        String netto = "Зарплатня за місяць з податком становить: ";
        String brutto = "Зарплатня за місяць без податку становить: ";

        if ((month<8) && ((month % 2) == 1)) {
            System.out.println(netto + salary31WithTax);
            System.out.println(brutto + salary31Day);
        }
        else if ((month<8) && ((month % 2) == 0) && (month!=2)) {
            System.out.println(netto + salary30WithTax);
            System.out.println(brutto + salary30Day);
        }
        else if ((month>7) && ((month % 2) == 0)) {
            System.out.println(netto + salary31WithTax);
            System.out.println(brutto + salary31Day);
        }
        else if (month>7) {
            System.out.println(netto + salary30WithTax);
            System.out.println(brutto + salary30Day);
        }
        // 2-й місяць року буде виключенням, беремо не високосний рік (кількість днів у місяці 28)
        else if (month == 2) {
            System.out.println(netto + salary28WithTax);
            System.out.println(brutto + salary28Day);
        }
    }
}
