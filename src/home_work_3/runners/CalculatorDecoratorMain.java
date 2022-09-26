package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.hard.CalculatorWithMemory;
import home_work_3.calcs.hard.CalculatorWithMemoryDecorator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {

    public static void main(String[] args) {
        ICalculator calculator = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

        double result = calculator.sum(calculator.sum(4.1, calculator.multiply(15, 7)), calculator.raiseDegree(calculator.divide(28.0, 5), 2));

        System.out.println("Result " + result);
        System.out.println("Count operation " + ((CalculatorWithCounterAutoDecorator) calculator).getCountOperation());



        if (calculator instanceof CalculatorWithCounterAutoDecorator) {
            ICalculator calcTemp1 = ((CalculatorWithCounterAutoDecorator) calculator).getCalculator();

            if (calcTemp1 instanceof CalculatorWithMemoryDecorator) {
                ((CalculatorWithMemoryDecorator) calcTemp1).saveInMemory(result);
                System.out.println("Memory " + ((CalculatorWithMemoryDecorator) calcTemp1).loadFromMemory());
            }

        }




    }

}
