package home_work_2.loops;

import java.util.Random;

public class LoopsTasksFromPresentation {

    public static void main(String[] args) {
        System.out.println("--- task 1 ---");
        largestDigitOfNaturalNumber(1221458934);
        System.out.println();

        System.out.println("--- task 2 ---");
        probabilityOfCreatingEvenNumbers();
        System.out.println();

        System.out.println("--- task 3 ---");
        quantityOddAndEvenDigitsInNumber(12345660);
        System.out.println();

        System.out.println("--- task 4 ---");
        System.out.println(fibonacciSeries(-1));
        System.out.println(fibonacciSeries(0));
        System.out.println(fibonacciSeries(1));
        System.out.println(fibonacciSeries(2));
        System.out.println(fibonacciSeries(3));
        System.out.println(fibonacciSeries(4));
        System.out.println(fibonacciSeries(5));
        System.out.println(fibonacciSeries(6));
        System.out.println(fibonacciSeries(7));
        System.out.println(fibonacciSeries(8));
        System.out.println(fibonacciSeries(9));
        System.out.println(fibonacciSeries(10));
        System.out.println();
    }


    /**
     * The method calculates the largest digit of a natural number.
     */
    public static void largestDigitOfNaturalNumber(int naturalNumber) {
        String naturalString = String.valueOf(naturalNumber);
        char[] array = naturalString.toCharArray();
        int maxDigit = Integer.parseInt(String.valueOf(array[0]));

        for (char c : array) {
            if (maxDigit < Integer.parseInt(String.valueOf(c))) {
                maxDigit = Integer.parseInt(String.valueOf(c));
            }
        }
        System.out.println("Largest digit in " + naturalNumber + ": " + maxDigit + ".");
    }


    /**
     * The method checks the probability of creating even random numbers.
     */
    public static void probabilityOfCreatingEvenNumbers() {

        int countRandomEven = 0;
        int countRandomOdd = 0;
        int randomNumber;
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            randomNumber = random.nextInt(1, 11);

            if (randomNumber % 2 == 0) {
                countRandomEven++;
            } else {
                countRandomOdd++;
            }
        }

        double probabilityEven = countRandomEven / 10.0;
        double probabilityOdd = countRandomOdd / 10.0;

        System.out.println("Probability of creating an even number is " + probabilityEven + "%.");
        System.out.println("Probability of creating an odd number is " + probabilityOdd + "%");
    }


    /**
     * The method calculates the quantity of odd digits and even digits in a number.
     */
    public static void quantityOddAndEvenDigitsInNumber(int number) {
        char[] array = String.valueOf(number).toCharArray();
        int evenCount = 0;
        int oddCount = 0;
        for (char c : array) {
            if (Integer.parseInt(String.valueOf(c)) % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number: " + number);
        System.out.println("Quantity of even digits: " + evenCount);
        System.out.println("Quantity of odd digits: " + oddCount);

    }


    /**
     * The method outputs Fibonacci series on the console.
     * @param i the number to which the method outputs a series.
     */
    public static String fibonacciSeries(int i) {
        StringBuilder result = new StringBuilder();
        if (i <= 0) return "Incorrect input";
        if (i == 1) return "0";

        int[] array = new int[i];

        array[0] = 0;
        array[1] = 1;


        for (int j = 2; j < array.length; j++) {
            array[j] = array[j - 1] + array[j - 2];
        }

        for (int temp : array) {
            result.append(temp).append(" ");
        }

        return result.toString();
    }
}




