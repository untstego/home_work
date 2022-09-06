package home_work_2.arrays.i_arrays_operation;

public class ForOperation implements IArraysOperation {
    public static void main(String[] args) {
        ForOperation forOperation = new ForOperation();
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("--- task 1 ---");
        forOperation.outputEveryElement(array);
        System.out.println();

        System.out.println("--- task 2 ---");
        forOperation.outputEverySecondElement(array);
        System.out.println();

        System.out.println("--- task 3 ---");
        forOperation.outputAllElementsReverse(array);
        System.out.println();
    }


    @Override
    public void outputEveryElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }


    @Override
    public void outputEverySecondElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i]);
            }
        }
    }


    @Override
    public void outputAllElementsReverse(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[array.length - i - 1]);
        }
    }
}
