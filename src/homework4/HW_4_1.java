package homework4;

import java.util.Scanner;

public class HW_4_1 {
    public static void main(String[] args) {
        String userAnswer;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("""
                    Вкажіть номер фігури, яку треба намалювати:
                    1) прямокутник
                    2) прямокутний трикутник
                    3) зворотній прямокутний трикутник
                    4) трикутник""");
            int figure = scan.nextInt();
            int n, k; //додаткові тимчасові змінні
            if (figure == 1) {
                System.out.println("Вкажіть висоту:");
                int height = scan.nextInt();
                System.out.println("Вкажіть ширину:");
                int width = scan.nextInt();
                for (int i = 0; i < height; ++i) {
                    for (int j = 0; j < width; ++j)
                        System.out.print("*");
                    System.out.println();
                }
            }
            else if (figure == 2) {
                System.out.println("Вкажіть висоту:");
                int height = scan.nextInt();
                for (int i = 1; i <= height; ++i) {
                    for (int j = 1; j <= i; ++j)
                        System.out.print("*");
                    System.out.println();
                }
            }
            else if (figure == 3) {
                System.out.println("Вкажіть висоту:");
                int height = scan.nextInt();
                for (int i = 1; i <= height; ++i) {
                    for (n = 0; n <= height - i; n++) {
                        System.out.print(" ");
                    }
                    for (k = i; k <= (i * 2) - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            else if (figure == 4) {
                System.out.println("Вкажіть висоту:");
                int height = scan.nextInt();
                for (int i = 0; i <= height; ++i) {
                    for (n = 1; n <= (height * 3 - i) - height * 2; n++) {
                        System.out.print(" ");
                    }
                    for (k = i; k <= (i * 3) - 2; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            System.out.print("Намалювати ще фігуру? (yes/no)" + "\n");
            userAnswer = scan.next();
        } while (userAnswer.equals("yes"));
    }
}
