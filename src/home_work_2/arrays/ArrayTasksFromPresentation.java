package home_work_2.arrays;

import java.util.Arrays;

public class ArrayTasksFromPresentation {

    public static void main(String[] args) {
        int[] array = ArraysUtils.arrayRandom(50, 100);

        System.out.println("--- task 1 ---");
        System.out.println(summaOddPositive(array));
        System.out.println();

        System.out.println("--- task 2 ---");
        System.out.println(maximumElementFromEvenIndexes(array));
        System.out.println();

        System.out.println("--- task 3 ---");
        System.out.println(lessTheArithmeticMean(array));
        System.out.println();

        System.out.println("--- task 4 ---");
        twoMinimalElement(array);
        System.out.println();

        System.out.println("--- task 5 ---");
        System.out.println(Arrays.toString(removeElementsToInterval(array, 12, 45)));
        System.out.println();

        System.out.println("--- task 6 ---");
        System.out.println(countSumArrayNumbers(array));
        System.out.println();

    }


    /**
     * The method counts the sum of even positive elements.
     */
    public static int summaOddPositive(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i > 0 && i % 2 == 0) {
                count = count + i;
            }
        }
        return count;
    }


    /**
     * The method finds the maximum element from elements with even indexes.
     */
    public static int maximumElementFromEvenIndexes(int[] array) {
        int maxElement = array[0];
        for (int i = 2; i < array.length; i = i + 2) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }


    /**
     * The method finds elements that are less than the arithmetic mean.
     */
    public static String lessTheArithmeticMean(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        int summaAllElements = 0;

        for (int i : array) {
            summaAllElements += i;
        }

        double arithmeticMean = (double) summaAllElements / array.length;

        for (int i : array) {
            if (i < arithmeticMean) {
                stringBuilder.append(i + " ");
            }
        }
        System.out.println("The arithmetic mean: " + arithmeticMean);
        return stringBuilder.toString();
    }


    /**
     * The method finds two minimal elements in the past array.
     */
    public static void twoMinimalElement(int[] array) {
        int firstMinimal = array[0];
        int secondMinimal = array[0];

        for (int i : array) {
            if (i < firstMinimal) {
                firstMinimal = i;
            }
        }

        for (int i : array) {
            if (i < secondMinimal && i > firstMinimal) {
                secondMinimal = i;
            }
        }

        System.out.println("First minimal: " + firstMinimal + ", second minimal: " + secondMinimal + ".");
    }


    /**
     * The method removes elements that belong to the interval.
     */
    public static int[] removeElementsToInterval(int[] array, int startInterval, int endInterval) {

        int[] resultArray = new int[array.length];
        int arrayVariable = 0;
        for (int i : array) {
            if (i < startInterval || i > endInterval) {
                resultArray[arrayVariable] = i;
                arrayVariable++;
            }
        }

        return resultArray;
    }


    /**
     * The method counts the sum of the array numbers.
     */
    public static int countSumArrayNumbers(int[] array) {
        int count = 0;

        for (int i : array) {
            char[] temp = String.valueOf(i).toCharArray();

            for (char c : temp) {
                count += Integer.parseInt(String.valueOf(c));
            }
        }

        return count;
    }
}
