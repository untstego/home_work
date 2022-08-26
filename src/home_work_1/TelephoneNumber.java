package home_work_1;

import java.util.Arrays;

public class TelephoneNumber {

    public static void main(String[] args) {
        int[] array = {0, 2, 9, 8, 8, 9, 5, 8, 7, 8};
        System.out.println(createPhoneNumber(array));
    }


    /**
     * Метод принимает массив и форматирует его при помощи StringBuilder.
     * @param arr целочисленный массив.
     * @return отформатированная строка.
     */
    public static String createPhoneNumber(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i]);
        }

        stringBuilder.insert(0, '(');
        stringBuilder.insert(4, ')');
        stringBuilder.insert(5, ' ');
        stringBuilder.insert(9, '-');

        return stringBuilder.toString();
    }
}
