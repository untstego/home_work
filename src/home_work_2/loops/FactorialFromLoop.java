package home_work_2.loops;

import java.math.BigInteger;


public class FactorialFromLoop {
    public static void main(String[] args) {
        System.out.println(calcFactorialFromLoop(12345));
        System.out.println(calcFactorialFromLoop(0));
        System.out.println(calcFactorialFromLoop(12));
        System.out.println(args[0]);
    }


    /**
     * Высчитывает факториал переданного числа. Проверяет на переполнение.
     * @return ход решений в строковом представлении.
     */
    public static String calcFactorialFromLoop(long x) {

        if (x <= 0) {
            return "Incorrect number entered";
        }

        long resultLong = 1;
        StringBuilder result = new StringBuilder();
        BigInteger checkOverflow = BigInteger.valueOf(resultLong);
        long lastValueBeforeOverflow = resultLong;
        boolean isOverflow = false;

        for (int i = 1; i <= x; i++) {
            lastValueBeforeOverflow = resultLong;
            resultLong = resultLong * i;
            result.append(i).append(" * ");

            checkOverflow = checkOverflow.multiply(BigInteger.valueOf(i));

            if (checkOverflow.compareTo(BigInteger.valueOf(resultLong)) != 0) {
                result.append("= Attention! An overflow has occurred!").append(" Value before overflow: ").append(lastValueBeforeOverflow);
                isOverflow = true;
                break;
            }

        }

        if (!isOverflow) {
            result.replace(result.length() - 2, result.length(), "= " + resultLong);
        }

        return result.toString();
    }

}

