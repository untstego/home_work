package home_work_2.arrays.i_arrays_operation;

public class ForEachOperation implements IArraysOperation {


    public static void main(String[] args) {
        ForEachOperation forEachOperation = new ForEachOperation();
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("--- task 1 ---");
        forEachOperation.outputEveryElement(array);
        System.out.println();

        System.out.println("--- task 2 ---");
        forEachOperation.outputEverySecondElement(array);
        System.out.println();

        System.out.println("--- task 3 ---");
        forEachOperation.outputAllElementsReverse(array);
        System.out.println();
    }


    @Override
    public void outputEveryElement(int[] array) {
        for (int i : array) {
            System.out.print(i);
        }
        System.out.println();
    }


    @Override
    public void outputEverySecondElement(int[] array) {
        int foreachVariable = 0;
        for (int i : array) {
            if (foreachVariable % 2 == 0) {
                System.out.print(i);
            }
            foreachVariable++;
        }
    }


    @Override
    public void outputAllElementsReverse(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : array) {
            stringBuilder.insert(0, i);
        }
        System.out.println(stringBuilder.toString());
    }
}
