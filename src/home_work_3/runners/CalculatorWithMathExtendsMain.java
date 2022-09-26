package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {

    public static void main(String[] args) {
        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
        double result = calculatorWithMathExtends.sum(calculatorWithMathExtends.sum(4.1, calculatorWithMathExtends.multiply(15, 7)), calculatorWithMathExtends.raiseDegree(calculatorWithMathExtends.divide(28.0, 5), 2));
        System.out.println(result);
    }
}
