package home_work_2.loops;

public class FactorialFromRecursion {

    public static void main(String[] args) {

    }


    /**
     * Использует логику метода calcRecursion и конструирует строку с ходом вычислений.
     */
    public static String calcFactorialFromRecursion(int x) {

        if (x <= 0) {
            return "Incorrect number entered";
        }

        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= x; i++) {
            result.append(i + " * ");
        }

        result.replace(result.length() - 2, result.length(), "= " + calcRecursion(x));

        return result.toString();
    }


    /**
     * Высчитывает факториал переданного числа при помощи рекурсии.
     */
    public static long calcRecursion(long x) {
        if (x == 1) {
            return 1;
        }
        return x * calcRecursion(x - 1);
    }
}

