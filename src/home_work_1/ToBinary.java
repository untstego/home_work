package home_work_1;

/**
 * 8.** Создать СТАТИЧЕСКИЙ метод String toBinaryString(byte number)
 * и возвращает двоичное представление числа.
 * В методе можно использовать только обычную математику которая описана в теории.
 * Если число отрицательное то вернуть дополнительный код. Теория https://planetcalc.ru/747. Пример:
 * 8.1 Вводим: 42.  Возвращает: 00101010
 * 8.2 Вводим: 15.  Возвращает: 00001111
 * 8.3 Вводим: -42. Возвращает: 11010110
 * 8.4 Вводим: -15. Возвращает: 11110001
 */

public class ToBinary {
    public static void main(String[] args) {

        System.out.println(toBinaryString((byte) -16));
        System.out.println(toBinaryString((byte) 16));
        System.out.println(toBinaryString((byte) 0));
        System.out.println(toBinaryString((byte) -44));
        System.out.println(toBinaryString((byte) 1));

    }


    /**
     * Последовательно использует логику других методов класса. Преобразует десятичное число
     * в двоичное.
     * @param number десятичное число.
     * @return прямой двоичный код (для положительных десятичных чисел) и дополнительный код (для отрицательных).
     */
    public static String toBinaryString(byte number) {

        if (number == 0) return "00000000";

        String result = "";

        if (number > 0) {
            result = toDirectCode(number);
        } else {
            number = (byte) Math.abs(number);
            result = toAdditionalCode(toReverseCode(toDirectCode(number)));
        }

        return result;
    }


    /**
     * Делает прямой двоичный код.
     *
     * @param number десятичное число.
     * @return соответствующее двоичное число в строковом представлении.
     */
    public static String toDirectCode(byte number) {
        String result = "";
        StringBuilder stringBuilder = new StringBuilder();

        boolean done = false;

        while (!done) {
            stringBuilder.insert(0, number % 2);
            number = (byte) (number / 2);

            if (number <= 1) {
                stringBuilder.insert(0, number);
                done = true;
            }
        }

        result = stringBuilder.toString();

        return String.format("%08d", Integer.parseInt(result));
    }


    /**
     * Делает обратный код из прямого двоичного кода.
     *
     * @param direct прямой двоичный код в строковом представлении.
     * @return обратный код в строковом представлении.
     */
    public static String toReverseCode(String direct) {

        StringBuilder stringBuilder = new StringBuilder();

        char[] array = direct.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == '0') {
                array[i] = '1';
            } else {
                array[i] = '0';
            }
        }

        for (char c : array) {
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }


    /**
     * Делает дополнительный код из обратного.
     *
     * @param reverse обратный код в строковом представлении.
     * @return дополнительный код
     */
    public static String toAdditionalCode(String reverse) {
        StringBuilder stringBuilder = new StringBuilder();


        char[] array = reverse.toCharArray();

        boolean isDone = false;
        int j = array.length - 1;

        while (!isDone) {
            if (array[j] == '0') {
                array[j] = '1';
                isDone = true;
            } else {
                array[j] = '0';
                j--;

                if (j == 0) {
                    isDone = true;
                }
            }
        }

        for (char c : array) {
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }

}
