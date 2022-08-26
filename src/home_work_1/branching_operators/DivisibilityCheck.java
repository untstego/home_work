package home_work_1.branching_operators;

public class DivisibilityCheck {

    public static void main(String[] args) {
        checkAndOutput(15, 5);
        checkAndOutput(13, 7);
        checkAndOutput(144, 12);
    }


    /**
     * Метод возвращает boolean делится ли одно из чисел на второе.
     */
    public static boolean divCheck(double first, double second) {
        return second % first == 0 || first % second == 0;
    }


    /**
     * Метод возвращает большее из двух чисел.
     */
    private static double searchLargerNumber(double first, double second) {
        return Math.max(first, second);
    }


    /**
     * Метод возвращает меньшее из двух чисел.
     */
    private static double searchSmallerNumber(double first, double second) {
        return Math.min(first, second);
    }


    /**
     * Метод использует логику других методов и конструирует
     * диалог с пользователем.
     */
    public static void checkAndOutput(double first, double second) {
        if (divCheck(first, second)) {
            System.out.println("Yes. " + searchLargerNumber(first, second)
                    + " is divided into " + searchSmallerNumber(first, second) + "\n");
        } else {
            System.out.println("No. " + first + " and " + second + " are not divisible by each other. \n");
        }
    }
}
