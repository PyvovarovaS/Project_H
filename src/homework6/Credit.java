package homework6;

public class Credit {
    // fields
    private double totalSum; // загальна сума кредиту
    private double monthlyTax; // місячний відсоток на залишок
    private double monthlyPayment; // щомісячний внесок
    private int paymentTerm; // строк кредита у місяцях
    private double remainingBalance; // залишок по кредиту

    // constructor
    public Credit() {
    }
    public Credit(double totalSum, double monthTax, int paymentTerm) {
        this.totalSum = totalSum;
        this.monthlyTax = monthTax;
        this.paymentTerm = paymentTerm;
//        calculateMonthlyPayment();
    }
    public Credit(double totalSum, double monthTax, double monthlyPayment) {
        this.totalSum = totalSum;
        this.monthlyTax = monthTax;
        this.monthlyPayment = monthlyPayment;
//        calculatePaymentTerm();
    }
    public Credit(double totalSum, double monthTax, double monthlyPayment, int paymentTerm) {
        this.totalSum = totalSum;
        this.monthlyTax = monthTax;
        this.monthlyPayment = monthlyPayment;
        calculateRemainingBalance();
    }

    // methods
    public double calculateMonthlyPayment() {
        monthlyPayment = 0; // сума місячного платіжу
        int payedMonths = 0; // кількість сплачених місяців
        remainingBalance = totalSum;
        while (payedMonths < paymentTerm && remainingBalance > 0) {
            remainingBalance += remainingBalance * monthlyTax;
            monthlyPayment = remainingBalance / (paymentTerm - payedMonths);
            remainingBalance -= monthlyPayment;
            payedMonths++;
        } return monthlyPayment;
    }
    public int calculatePaymentTerm() {
        double paymentTerm = 0;
        while (totalSum > 0) {
            totalSum -= monthlyPayment;
            totalSum += totalSum * monthlyTax;
            paymentTerm ++;
        }
        return (int) paymentTerm;
    }
    public double calculateRemainingBalance() {
        int payedMonths = 0; // кількість сплачених місяців
        remainingBalance = totalSum;
        while (payedMonths < paymentTerm && remainingBalance > 0) {
            remainingBalance += remainingBalance * monthlyTax;
            monthlyPayment = remainingBalance / (paymentTerm - payedMonths);
            remainingBalance -= monthlyPayment;
            payedMonths++;
        } return remainingBalance;
    }

    //getters
    public double getTotalSum() {
        return totalSum;
    }

    public double getMonthTax() {
        return monthlyTax;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public int getPaymentTerm() {
        return paymentTerm;
    }
    public int getPaymentsAmount() {
        return paymentTerm;
    }
    public double getRemainingBalance() {
        return remainingBalance;
    }

    //setters
    public void setTotalSum(double totalSum) {
        this.totalSum = totalSum;
    }

    public void setMonthTax(double monthTax) {
        this.monthlyTax = monthTax;
    }

    public void setPaymentTerm(int paymentTerm) {
        this.paymentTerm = paymentTerm;
    }
    public void setPaymentsAmount(int paymentsAmount) {
        this.paymentTerm = paymentsAmount;
    }

}
