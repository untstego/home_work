package home_work_2.loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        showMultiplicationTable();
    }


    /**
     * The method outputs a multiplication table to the console.
     */
    public static void showMultiplicationTable() {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 10; j++) {
                for (int k = 2; k <= 5; k++) {
                    System.out.printf("%2d * %2d = %3d \t", (k * i), j, (k * j * i));
                }
                System.out.println("");
            }
            System.out.println("");
        }

    }
}

