package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterDelegateCompositeMain {

    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calculatorWithCounterDelegateCompositeMain = new CalculatorWithCounterAutoComposite();

        double multiply = calculatorWithCounterDelegateCompositeMain.multiply(15, 7);
        System.out.println(multiply);

        double sum1 = calculatorWithCounterDelegateCompositeMain.sum(4.1, multiply);
        System.out.println(sum1);

        double divide = calculatorWithCounterDelegateCompositeMain.divide(28.0, 5);
        System.out.println(divide);

        double degree = calculatorWithCounterDelegateCompositeMain.raiseDegree(divide, 2);
        System.out.println(degree);

        double result = calculatorWithCounterDelegateCompositeMain.sum(sum1, degree);
        System.out.println(result);

        System.out.println(calculatorWithCounterDelegateCompositeMain.getCountOperation());

    }
}
