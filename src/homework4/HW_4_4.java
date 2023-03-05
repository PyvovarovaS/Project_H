package homework4;

public class HW_4_4 {
    public static void main(String[] args) {
        double rate = Integer.parseInt(args[0]); // вартість години
        double taxPercent = Integer.parseInt(args[1]); // вісоток податку, %
        taxPercent = taxPercent / 100;
        int weeksPerMonth = 4; // кількість тижнів у місяці
        int weekends = 2; // кількість вихідних днів на тиждень
        int workHoursPerDay = 8; // кількість робочих годин в день
        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN",
                "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
        double[] monthlySalaries = new double[12]; // зарплатня за кожен місяць
        for (int i = 0; i < 12; i++) {
            int workDaysInMonth = getDaysInMonth(months[i]) - weekends * weeksPerMonth; // робочі дні на місяць
            int hoursInMonth = workDaysInMonth * workHoursPerDay; // робочі години на місяць
            double salaryWithoutTax = hoursInMonth * rate; // зарплатня за місяць без податку
            double salaryWithTax = salaryWithoutTax * (1 - taxPercent);  // зарплатня за місяць з податком
            monthlySalaries[i] = salaryWithTax;
            System.out.printf("%s %.2f %.2f\n", months[i], salaryWithoutTax, salaryWithTax);
        }
        double totalSalaryWithoutTax = 0; // загальна зарплата за рік без податку
        double totalSalaryWithTax = 0; // загальна зарплата за рік з податком
        for (double monthlySalary : monthlySalaries) {
            totalSalaryWithoutTax += monthlySalary;
            totalSalaryWithTax += monthlySalary * (1 - taxPercent);
        }
        System.out.printf("TOTAL: %.2f %.2f", totalSalaryWithoutTax, totalSalaryWithTax);
    }
    // функція, яка повертає кількість днів у місяці
    public static int getDaysInMonth(String month) {
        return switch (month) {
            case "JAN", "MAR", "MAY", "JUL", "AUG", "OCT", "DEC" -> 31;
            case "APR", "JUN", "SEP", "NOV" -> 30;
            case "FEB" -> 28; // рік не високосний
            default -> 0;
        };
    }
}
