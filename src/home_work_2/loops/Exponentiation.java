package home_work_2.loops;

import java.io.IOException;
import java.util.Scanner;

public class Exponentiation {

    public static void main(String[] args) throws IOException {
        exponentiation();
    }


    /**
     * Запрашивает у пользователя два числа. Возводит первое число в степень, равную второму числу.
     */
    public static void exponentiation() throws IOException {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);

        double num = scanner.nextDouble();


        System.out.println("Enter a degree");
        int degree = 0;
        if (scanner.hasNextInt()) {
            degree = scanner.nextInt();
        }

        if (degree <= 0) {
            System.out.println("Try again, the degree must be an integer and positive");
            return;
        }

        double result = 1;
        for (int i = 1; i <= degree; i++) {
            result *= num;
        }
        System.out.printf("%.1f ^ %d = %.1f", num, degree, result);

    }
}

