package home_work_2.arrays.i_arrays_operation;

public class DoWhileOperation implements IArraysOperation {

    public static void main(String[] args) {

        DoWhileOperation doWhileOperation = new DoWhileOperation();
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("--- task 1 ---");
        doWhileOperation.outputEveryElement(array);
        System.out.println();

        System.out.println("--- task 2 ---");
        doWhileOperation.outputEverySecondElement(array);
        System.out.println();

        System.out.println("--- task 3 ---");
        doWhileOperation.outputAllElementsReverse(array);
        System.out.println();


    }


    @Override
    public void outputEveryElement(int[] array) {
        int doWhileVariable = 0;
        do {
            System.out.print(array[doWhileVariable]);
            doWhileVariable++;
        } while (doWhileVariable < array.length);

        System.out.println();
    }


    @Override
    public void outputEverySecondElement(int[] array) {
        int doWhileVariable = 0;
        do {
            if (doWhileVariable % 2 == 0) {
                System.out.print(array[doWhileVariable]);
            }
            doWhileVariable++;
        } while (doWhileVariable < array.length);

        System.out.println();
    }


    @Override
    public void outputAllElementsReverse(int[] array) {
        int doWhileVariable = 0;

        do {
            System.out.print(array[array.length - doWhileVariable - 1]);
            doWhileVariable++;
        } while (doWhileVariable < array.length);

        System.out.println();
    }
}
