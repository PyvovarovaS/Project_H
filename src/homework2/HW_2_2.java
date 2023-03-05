package homework2;

public class HW_2_2 {
    public static void main(String[] args) {
        int hours = Integer.parseInt(args[0]);
        int rate = Integer.parseInt(args[1]);
        int taxPercent = Integer.parseInt(args[2]);
        int monthsInYear = 12;
        int weeksInMonth = 4;
        double bruttoMonth = rate * hours * weeksInMonth; // Зарплатня на місяць без податків
        double bruttoYear = rate * hours * weeksInMonth * monthsInYear; // Зарплатня на рік без податків
        double nettoMonth = bruttoMonth - (bruttoMonth * taxPercent/100); // Зарплатня на місяць з податками
        double nettoYear = bruttoYear - (bruttoYear * taxPercent/100); // Зарплатня на рік з податками
        System.out.println("Зарплатня на місяць без податків:" + String.format("%.2f", bruttoMonth));
        System.out.println("Зарплатня на місяць з податками:" + String.format("%.2f", nettoMonth));
        System.out.println("Зарплатня на рік без податків:" + String.format("%.2f", bruttoYear));
        System.out.println("Зарплатня на рік з податками:" + String.format("%.2f", nettoYear));
    }
}
