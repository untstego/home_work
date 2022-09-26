package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {

        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregation CalculatorWithCounterAutoAgregation = new CalculatorWithCounterAutoAgregation(calculatorWithMathCopy);

        double multiply = CalculatorWithCounterAutoAgregation.multiply(15, 7);
        System.out.println(multiply);

        double sum1 = CalculatorWithCounterAutoAgregation.sum(4.1, multiply);
        System.out.println(sum1);

        double divide = CalculatorWithCounterAutoAgregation.divide(28.0, 5);
        System.out.println(divide);


        double degree = CalculatorWithCounterAutoAgregation.raiseDegree(divide, 2);
        System.out.println(degree);

        double result = CalculatorWithCounterAutoAgregation.sum(sum1, degree);
        System.out.println(result);

        System.out.println(CalculatorWithCounterAutoAgregation.getCountOperation());
    }
}
