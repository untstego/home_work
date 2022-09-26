package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;

public class CalculatorWithCounterDelegateChoiceAgregationMain {

    public static void main(String[] args) {

        System.out.println("-------------------------------");
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoChoiceAgregation calculatorWithCounterAutoChoiceAgregation1 = new CalculatorWithCounterAutoChoiceAgregation(calculatorWithMathCopy);
        double multiply = calculatorWithCounterAutoChoiceAgregation1.multiply(15, 7);
        System.out.println(multiply);
        double sum1 = calculatorWithCounterAutoChoiceAgregation1.sum(4.1, multiply);
        System.out.println(sum1);
        double divide = calculatorWithCounterAutoChoiceAgregation1.divide(28.0, 5);
        System.out.println(divide);
        double degree = calculatorWithCounterAutoChoiceAgregation1.raiseDegree(divide, 2);
        System.out.println(degree);
        double result = calculatorWithCounterAutoChoiceAgregation1.sum(sum1, degree);
        System.out.println(result);
        System.out.println(calculatorWithCounterAutoChoiceAgregation1.getCountOperation());


        System.out.println("-------------------------------");
        CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoChoiceAgregation calculatorWithCounterAutoChoiceAgregation = new CalculatorWithCounterAutoChoiceAgregation(calculator);
        double multiply1 = calculatorWithCounterAutoChoiceAgregation.multiply(15, 7);
        System.out.println(multiply1);
        double sum12 = calculatorWithCounterAutoChoiceAgregation.sum(4.1, multiply);
        System.out.println(sum12);
        double divide1 = calculatorWithCounterAutoChoiceAgregation.divide(28.0, 5);
        System.out.println(divide1);
        double degree1 = calculatorWithCounterAutoChoiceAgregation.raiseDegree(divide, 2);
        System.out.println(degree1);
        double result1 = calculatorWithCounterAutoChoiceAgregation.sum(sum1, degree);
        System.out.println(result1);
        System.out.println(calculatorWithCounterAutoChoiceAgregation.getCountOperation());


        System.out.println("-------------------------------");
        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
        CalculatorWithCounterAutoChoiceAgregation calculatorLast = new CalculatorWithCounterAutoChoiceAgregation(calculatorWithOperator);
        double multiply11 = calculatorLast.multiply(15, 7);
        System.out.println(multiply11);
        double sum123 = calculatorLast.sum(4.1, multiply);
        System.out.println(sum123);
        double divide11 = calculatorLast.divide(28.0, 5);
        System.out.println(divide11);
        double degree11 = calculatorLast.raiseDegree(divide, 2);
        System.out.println(degree11);
        double result11 = calculatorLast.sum(sum1, degree);
        System.out.println(result11);
        System.out.println(calculatorLast.getCountOperation());

    }
}
