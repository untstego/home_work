package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {

    private CalculatorWithMathCopy calculatorWithMathCopy;
    private long countOperation;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
    }

    private void IncCountOperation() {
        this.countOperation++;
    }

    public long getCountOperation() {
        return countOperation;
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
        return this.calculatorWithMathCopy.sum(a, b);
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
        return this.calculatorWithMathCopy.subtraction(a, b);
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
        return this.calculatorWithMathCopy.multiply(a, b);
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
        return this.calculatorWithMathCopy.divide(a, b);
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
        return this.calculatorWithMathCopy.raiseDegree(a, b);
    }


    /**
     * The method returns a modulus of a number.
     *
     * @param a number.
     * @return modulus.
     */
    public double module(double a) {
        IncCountOperation();
        return this.calculatorWithMathCopy.module(a);
    }


    /**
     * The method returns a square root of a number.
     *
     * @param a number.
     * @return square root.
     */
    public double squareRoot(double a) {
        IncCountOperation();
        return this.calculatorWithMathCopy.squareRoot(a);
    }

}
