package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {

    private CalculatorWithMathCopy calculatorWithMathCopy;
    private int countOperation;

    private void IncCountOperation() {
        this.countOperation++;
    }

    public long getCountOperation() {
        return countOperation;
    }


    public CalculatorWithCounterAutoComposite() {
        this.calculatorWithMathCopy = new CalculatorWithMathCopy();
    }


    /**
     * The method adds up the passed values.
     *
     * @param a first value.
     * @param b second value.
     * @return sum.
     */
    public double sum(double a, double b) {
        IncCountOperation();
        return calculatorWithMathCopy.sum(a, b);
    }


    /**
     * The method subtracts the second passed value from the first.
     *
     * @param a first value.
     * @param b second value.
     * @return difference.
     */
    public double subtraction(double a, double b) {
        IncCountOperation();
        return calculatorWithMathCopy.subtraction(a, b);
    }


    /**
     * The method multiplies two values.
     *
     * @param a first value.
     * @param b second value.
     * @return product.
     */
    public double multiply(double a, double b) {
        IncCountOperation();
        return calculatorWithMathCopy.multiply(a, b);
    }


    /**
     * The method divides the second values from the first.
     *
     * @param a dividend.
     * @param b divisor.
     * @return quotient.
     */
    public double divide(double a, double b) {
        IncCountOperation();
        return calculatorWithMathCopy.divide(a, b);
    }


    /**
     * The method raises the transmitted number to the transmitted degree.
     *
     * @param a number.
     * @param b degree.
     * @return result of the operation.
     */
    public double raiseDegree(double a, int b) {
        IncCountOperation();
        return calculatorWithMathCopy.raiseDegree(a, b);
    }


    /**
     * The method returns a modulus of a number.
     *
     * @param a number.
     * @return modulus.
     */
    public double module(double a) {
        IncCountOperation();
        return calculatorWithMathCopy.module(a);
    }


    /**
     * The method returns a square root of a number.
     *
     * @param a number.
     * @return square root.
     */
    public double squareRoot(double a) {
        IncCountOperation();
        return calculatorWithMathCopy.squareRoot(a);
    }


}
