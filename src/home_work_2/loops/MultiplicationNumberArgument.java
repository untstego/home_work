package home_work_2.loops;

import java.io.IOException;
import java.util.Scanner;

public class MultiplicationNumberArgument {

    public static void main(String[] args) throws IOException {
        System.out.println(multiplicationNumber("1234"));
        System.out.println(multiplicationNumber("Help"));
        System.out.println(multiplicationNumber("-154"));
    }


    /** Перемножает между собой все цифры переданного числа.
     *
     * @param s число в строковом представлении.
     * @return результат и ход умножения в строковом представлении.
     */
    public static String multiplicationNumber(String s) throws IOException {
        StringBuilder result = new StringBuilder();
        if (stringIsInteger(s)) {
            char[] array = s.toCharArray();
            long resultLong = 1;

            for (char c : array) {
                resultLong = resultLong * Integer.parseInt(String.valueOf(c));
                result.append(c).append(" * ");
            }
            result.replace(result.length() - 2, result.length(), "= " + resultLong);
        }
        return result.toString();
    }


    /**
     * Проверяет, содержится ли в переданной строке только целочисленное значение.
     */
    public static boolean stringIsInteger(String s) {
        if (s.contains(".") || s.contains(",")) {
            System.out.println("Not an integer entered");
            return false;
        }

        if (s.contains("-")) {
            System.out.println("Not a positive entered");
            return false;
        }

        int result = 0;

        try {
            result = Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            System.out.println("Not a number entered");
            return false;
        }

        return true;
    }
}
