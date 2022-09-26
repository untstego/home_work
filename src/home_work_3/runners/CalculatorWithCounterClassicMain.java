package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {

    public static void main(String[] args) {


        CalculatorWithCounterClassic calculatorWithCounterClassic = new CalculatorWithCounterClassic();

        double multiply = calculatorWithCounterClassic.multiply(15, 7);
        calculatorWithCounterClassic.incrementCountOperation();

        double sum1 = calculatorWithCounterClassic.sum(4.1, multiply);
        calculatorWithCounterClassic.incrementCountOperation();

        double divide = calculatorWithCounterClassic.divide(28.0, 5);
        calculatorWithCounterClassic.incrementCountOperation();

        double degree = calculatorWithCounterClassic.raiseDegree(divide, 2);
        calculatorWithCounterClassic.incrementCountOperation();

        double result = calculatorWithCounterClassic.sum(sum1, degree);
        calculatorWithCounterClassic.incrementCountOperation();

        System.out.println(result);
        System.out.println(calculatorWithCounterClassic.getCount());
    }
}
