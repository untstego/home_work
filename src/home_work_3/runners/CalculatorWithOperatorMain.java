package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
//4.1 + 15 * 7 + (28 / 5) ^ 2
    public static void main(String[] args) {
        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
        double result = calculatorWithOperator.sum(calculatorWithOperator.sum(4.1, calculatorWithOperator.multiply(15, 7)), calculatorWithOperator.raiseDegree(calculatorWithOperator.divide(28.0, 5), 2));
        System.out.println(result);
    }
}
