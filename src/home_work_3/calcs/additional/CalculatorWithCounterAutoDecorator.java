package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {
    private ICalculator calculator;
    private long countOperation;

    public long getCountOperation() {
        return countOperation;
    }

    public ICalculator getCalculator() {
        return calculator;
    }

    public void IncCountOperation() {
        this.countOperation++;
    }

    public CalculatorWithCounterAutoDecorator(ICalculator iCalculator) {
        this.calculator = iCalculator;
    }


    public double sum(double a, double b) {
        IncCountOperation();
        return calculator.sum(a, b);
    }


    public double subtraction(double a, double b) {
        IncCountOperation();
        return calculator.subtraction(a, b);
    }


    public double multiply(double a, double b) {
        IncCountOperation();
        return calculator.multiply(a, b);
    }


    public double divide(double a, double b) {
        IncCountOperation();
        return calculator.divide(a, b);
    }


    public double raiseDegree(double a, int b) {
        IncCountOperation();
        return calculator.raiseDegree(a, b);
    }


    public double module(double a) {
        IncCountOperation();
        return calculator.module(a);
    }


    public double squareRoot(double a) {
        IncCountOperation();
        return calculator.squareRoot(a);
    }
}

