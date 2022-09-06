package home_work_2.arrays.i_arrays_operation;

public class WhileOperation implements IArraysOperation {


    public static void main(String[] args) {
        WhileOperation whileOperation = new WhileOperation();
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("--- task 1 ---");
        whileOperation.outputEveryElement(array);
        System.out.println();

        System.out.println("--- task 2 ---");
        whileOperation.outputEverySecondElement(array);
        System.out.println();

        System.out.println("--- task 3 ---");
        whileOperation.outputAllElementsReverse(array);
        System.out.println();
    }

    @Override
    public void outputEveryElement(int[] array) {
        int whileVariable = 0;
        while (whileVariable < array.length) {
            System.out.print(array[whileVariable]);
            whileVariable++;
        }
        System.out.println();
    }


    @Override
    public void outputEverySecondElement(int[] array) {
        int whileVariable = 0;
        while (whileVariable < array.length) {
            System.out.print(array[whileVariable]);
            whileVariable += 2;
        }
        System.out.println();
    }


    @Override
    public void outputAllElementsReverse(int[] array) {
        int whileVariable = 0;
        while (whileVariable < array.length) {
            System.out.print(array[array.length - whileVariable - 1]);
            whileVariable++;
        }
        System.out.println();
    }
}
