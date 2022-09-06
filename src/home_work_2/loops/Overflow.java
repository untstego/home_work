package home_work_2.loops;

import java.math.BigInteger;

public class Overflow {
    public static void main(String[] args) {
        multiplicationToOverflow(3);
        multiplicationToOverflow(188);
        multiplicationToOverflow(-19);


    }

    /**
     * Умножает единицу на переданное число до переполнения.
     * @param i число, на которое будет умножаться единица.
     */
    public static void multiplicationToOverflow(int i) {

        long resultLong = 1;
        BigInteger checkOverflow = BigInteger.valueOf(resultLong);
        long lastValueBeforeOverflow = resultLong;
        boolean isOverflow = false;

        while (!isOverflow) {
            lastValueBeforeOverflow = resultLong;
            resultLong = resultLong * i;
            checkOverflow = checkOverflow.multiply(BigInteger.valueOf(i));

            if (checkOverflow.compareTo(BigInteger.valueOf(resultLong)) != 0) {
                System.out.println("Overflow! Value before overflow: " + lastValueBeforeOverflow + ", value after overflow: " + resultLong);
                isOverflow = true;
            }
        }
    }
}
