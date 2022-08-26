package home_work_1;

public class LeapYear {
    public static void main(String[] args) {
        isLeapCons(2005);
        isLeapCons(12);
        isLeapCons(2008);
        isLeapCons(2012);
        isLeapCons(2022);
        isLeapCons(1992);
    }


    /**
     * Проверяет, високосный ли год.
     * @param year номер года.
     * @return булево значение (true — високосный).
     */
    public static boolean isLeap(int year) {
        return year % 4 == 0;
    }


    /**
     * Использует логику метода isLeap, выводит в консоль итог работы метода.
     */
    public static void isLeapCons(int year) {
        System.out.println(year + " is leap? " + isLeap(year));
    }

}


