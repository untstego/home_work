package home_work_1;

public class SleepIn {
    public static void main(String[] args) {
        sleepInCons(true, true);
        sleepInCons(false, true);
        sleepInCons(true, false);
        sleepInCons(false, false);
    }


    /**
     * Метод проверяет, можно ли продолжать спать.
     *
     * @param weekday  рабочий ли день.
     * @param vacation отпуск ли.
     * @return булево значение, можно ли продолжать спать.
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }


    /**
     * Использует метод sleepIn, выводит сообщение, можно ли продолжать спать.
     */
    public static void sleepInCons(boolean weekday, boolean vacation) {
        System.out.print("Can I sleep? ");
        if (sleepIn(weekday, vacation)) {
            System.out.println("Yes.");
        } else {
            System.out.println("No");
        }

    }
}
