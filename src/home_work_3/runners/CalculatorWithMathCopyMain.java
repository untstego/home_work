package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {

    public static void main(String[] args) {
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        double result = calculatorWithMathCopy.sum(calculatorWithMathCopy.sum(4.1, calculatorWithMathCopy.multiply(15, 7)), calculatorWithMathCopy.raiseDegree(calculatorWithMathCopy.divide(28.0, 5), 2));
        System.out.println(result);
    }
}
