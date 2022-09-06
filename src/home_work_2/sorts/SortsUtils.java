package home_work_2.sorts;

import java.util.Arrays;

public class SortsUtils {


    /**
     * The method sorts the array by bubble sorting.
     */
    public static int[] bubble(int[] arr) {

        int[] resultArray = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; (j < resultArray.length - 1); j++) {
                if (resultArray[j] > resultArray[j + 1]) {
                    int temp = resultArray[j];
                    resultArray[j] = resultArray[j + 1];
                    resultArray[j + 1] = temp;
                }
            }
        }
        return resultArray;
    }


    /**
     * The method sorts the array by shaker sorting.
     */
    public static void shake(int[] arr) {
        int[] resultArray = Arrays.copyOf(arr, arr.length);
        int left = 0;
        int right = (resultArray.length - 1);
        int control = right;

        while (left < right) {

            for (int i = left; i < right; i++) {
                if (resultArray[i] > resultArray[i + 1]) {
                    int temp = resultArray[i];
                    resultArray[i] = resultArray[i + 1];
                    resultArray[i + 1] = temp;
                    control = i;
                }
            }
            right = control;

            for (int i = right; i > left; i--) {
                if (resultArray[i] < resultArray[i - 1]) {
                    int temp = resultArray[i];
                    resultArray[i] = resultArray[i - 1];
                    resultArray[i - 1] = temp;
                    control = i;
                }
            }
            left = control;
        }
    }

}
