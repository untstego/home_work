package home_work_2.arrays;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {

    /** Method creates massive. Method asks the user for the size of the array and each element.
     */
    public static int[] arrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a array's size");
        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a " + i + " element");
            array[i] = scanner.nextInt();
        }

        return array;
    }


    /** Method creates massive.
     * @param size size of the array.
     * @param maxValueExclusion limit of generated numbers.
     */
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] myArray = new int[size];
        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(maxValueExclusion);
        }
        return myArray;
    }
}
