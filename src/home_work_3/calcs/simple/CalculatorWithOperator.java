package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

    /**
     * The method adds up the passed values.
     * @param a first value.
     * @param b second value.
     * @return sum.
     */
    public double sum (double a, double b) {
        return a + b;
    }


    /**
     * The method subtracts the second passed value from the first.
     * @param a first value.
     * @param b second value.
     * @return difference.
     */
    public double subtraction (double a, double b) {
        return a - b;
    }


    /**
     * The method multiplies two values.
     * @param a first value.
     * @param b second value.
     * @return product.
     */
    public double multiply (double a, double b) {
        return a * b;
    }


    /**
     * The method divides the second values from the first.
     * @param a dividend.
     * @param b divisor.
     * @return quotient.
     */
    public double divide (double a, double b) {
        return a / b;
    }


    /**
     * The method raises the transmitted number to the transmitted degree.
     * @param a number.
     * @param b degree.
     * @return result of the operation.
     */
    public double raiseDegree (double a, int b) {

        double result = 1;

        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }


    /**
     * The method returns a modulus of a number.
     * @param a number.
     * @return modulus.
     */
    public double module (double a) {
        return (a > 0 ? a : -a);
    }


    /**
     * The method returns a square root of a number.
     * @param a number.
     * @return square root.
     */
    public double squareRoot (double a) {
        return Math.sqrt(a);
    }
}
