package home_work_1;

import java.util.Scanner;

public class BitwiseOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = enteringNumbersViaConsole(scanner);
        int b = enteringNumbersViaConsole(scanner);

        usingBitwiseAndOr(a, b);

        /* Пример с использованием чисел 5 и 15.

         * 0000_0101 == 5
         * 0000_1111 == 15
         *
         * При использовании побитового "И" итоговый бит
         * равен 1, если соответствующие биты в обоих операндах равны 1.
         * Итог — 0000_0101 (5).
         *
         * При использовании побитового "ИЛИ" итоговый бит
         * равен 1, если соответствующий бит в любом из операндов равен 1.
         * Итог — 0000_1111 (15).

         */

        /*
        Пояснение к пункту 1.4: побитовые операции производятся только с
        целочисленными значениями.
         */
    }


    /**
     * Получение числа через консоль
     */
    public static int enteringNumbersViaConsole(Scanner scanner) {
        System.out.println("Enter an integer number");
        return scanner.nextInt();
    }


    /**
     * Использование побитовых "И" и "ИЛИ".
     * Метод выведет в консоль итог логических операций.
     */
    public static void usingBitwiseAndOr(int a, int b) {
        System.out.println("The result of the logical operation AND: " + (a & b));
        System.out.println("The result of the logical operation OR: " + (a | b));
    }
}
