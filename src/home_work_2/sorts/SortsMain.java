package home_work_2.sorts;

import home_work_2.arrays.ArraysUtils;

import java.io.IOException;
import java.util.Arrays;

public class SortsMain {

        public static void main(String[] args) throws IOException {

            int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
            int[] arr2 = new int[]{1, 1, 1, 1};
            int[] arr3 = new int[]{9, 1, 5, 99, 9, 9};
            int[] arr4 = new int[]{};
            int[] arr5 = new int[]{6, 5, 4, 3, 2, 1};
            int[] arr6 = ArraysUtils.arrayRandom(50, 100);
            int[] arr7 = ArraysUtils.arrayFromConsole();


            int[] sortedBubble1 = SortsUtils.bubble(arr1);
            printResult(arr1, SortsUtils.bubble(arr1));

            int[] sortedBubble2 = SortsUtils.bubble(arr2);
            printResult(arr2, sortedBubble2);

            int[] sortedBubble3 = SortsUtils.bubble(arr3);
            printResult(arr3, sortedBubble3);

            int[] sortedBubble4 = SortsUtils.bubble(arr4);
            printResult(arr4, sortedBubble4);

            int[] sortedBubble5 = SortsUtils.bubble(arr5);
            printResult(arr5, sortedBubble5);

            int[] sortedBubble6 = SortsUtils.bubble(arr6);
            printResult(arr6, sortedBubble6);

            int[] sortedBubble7 = SortsUtils.bubble(arr7);
            printResult(arr7, sortedBubble7);
        }



        public static void printResult(int[] arrBefore, int[] arrAfter) {
            System.out.println(Arrays.toString(arrBefore) + " -> " + Arrays.toString(arrAfter));
        }

    }
