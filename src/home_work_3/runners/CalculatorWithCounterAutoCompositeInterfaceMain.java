package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoCompositeInterfaceMain {

    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregationInterface calculator = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithCounterAutoSuper());


        double multiply = calculator.multiply(15, 7);
        System.out.println(multiply);

        double sum1 = calculator.sum(4.1, multiply);
        System.out.println(sum1);

        double divide = calculator.divide(28.0, 5);
        System.out.println(divide);

        double degree = calculator.raiseDegree(divide, 2);
        System.out.println(degree);

        double result = calculator.sum(sum1, degree);
        System.out.println(result);

        System.out.println(calculator.getCountOperation());
    }
}
