package home_work_2.arrays;

public class ArraysIteration {

    public static void main(String[] args) {

        System.out.println("---task 1---");
        outputAllElements(ArraysUtils.arrayFromConsole());
        System.out.println();

        System.out.println("---task 2---");
        outputEverySecondElement(ArraysUtils.arrayFromConsole());
        System.out.println();


        System.out.println("---task 3---");
        outputAllElementsReverse(ArraysUtils.arrayFromConsole());
    }


    /**
     * Method outputs all array's elements in console four time. Method uses four cycles.
     */
    public static void outputAllElements(int[] array) {

        //first time
        int doWhileVariable = 0;
        do {
            System.out.print(array[doWhileVariable]);
            doWhileVariable++;
        } while (doWhileVariable < array.length);
        System.out.println();


        //second time
        while (doWhileVariable > 0) {
            System.out.print(array[array.length - doWhileVariable]);
            doWhileVariable--;
        }
        System.out.println();


        //third time
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();


        //fourth time
        for (int j : array) {
            System.out.print(j);
        }
        System.out.println();
    }


    /**
     * Method outputs every second array's element in console four time. Method uses four cycles.
     */
    public static void outputEverySecondElement(int[] array) {

        //first time
        int doWhileVariable = 0;
        do {
            System.out.print(array[doWhileVariable]);
            doWhileVariable += 2;
        } while (doWhileVariable < array.length);
        System.out.println();


        //second time
        while (doWhileVariable > 0) {
            System.out.print(array[array.length - doWhileVariable]);
            doWhileVariable -= 2;
        }
        System.out.println();


        //third time
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            i++;
        }
        System.out.println();


        //fourth time
        int iterationCounter = 0;
        for (int j : array) {
            if (iterationCounter % 2 == 0) {
                System.out.print(j);
            }
            iterationCounter++;
        }
        System.out.println();
    }


    /**
     * Method outputs all array's elements in reverse in console four time. Method uses four cycles.
     */
    public static void outputAllElementsReverse(int[] array) {

        //first time
        int cycleVariable = array.length;
        do {
            System.out.print(array[cycleVariable - 1]);
            cycleVariable--;
        } while (cycleVariable > 0);
        System.out.println();


        //second time
        while (cycleVariable < array.length) {
            System.out.print(array[array.length - cycleVariable - 1]);
            cycleVariable++;
        }
        System.out.println();


        //third time
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[array.length - i - 1]);
        }
        System.out.println();


        //fourth time
        StringBuilder stringBuilder = new StringBuilder();
        for (int j : array) {
            stringBuilder.insert(0, j);
        }
        System.out.println(stringBuilder.toString());
        System.out.println();
    }
}
