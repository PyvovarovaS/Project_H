package homework2;

public class HW_2_1 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int degree = Integer.parseInt(args[1]);
        System.out.printf("%.0f \n", Math.pow(number, degree)); // піднесення першого числа в ступінь другого числа
    }
}
