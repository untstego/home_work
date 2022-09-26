package home_work_3.runners;

import home_work_3.calcs.hard.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {

    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        CalculatorWithMemory calc = new CalculatorWithMemory(calculator);

        calc.saveInMemory(calc.multiply(15, 7));
        calc.saveInMemory(calc.sum(4.1, calc.loadFromMemory()));
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        calc.saveInMemory(calc.sum(calc.loadFromMemory(), calc.raiseDegree(calc.divide(28, 5), 2)));

        System.out.println(calc.loadFromMemory());


    }
}
