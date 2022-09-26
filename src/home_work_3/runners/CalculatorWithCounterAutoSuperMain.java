package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterAutoSuperMain {


    public static void main(String[] args) {

        CalculatorWithCounterAutoSuper calculatorWithCounterAutoSuper = new CalculatorWithCounterAutoSuper();

        double multiply = calculatorWithCounterAutoSuper.multiply(15, 7);
        System.out.println(multiply);

        double sum1 = calculatorWithCounterAutoSuper.sum(4.1, multiply);
        System.out.println(sum1);

        double divide = calculatorWithCounterAutoSuper.divide(28.0, 5);
        System.out.println(divide);

        double degree = calculatorWithCounterAutoSuper.raiseDegree(divide, 2);
        System.out.println(degree);

        double result = calculatorWithCounterAutoSuper.sum(sum1, degree);
        System.out.println(result);

        System.out.println(calculatorWithCounterAutoSuper.getCountOperation());
    }
}
