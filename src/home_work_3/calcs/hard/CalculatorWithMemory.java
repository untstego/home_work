package home_work_3.calcs.hard;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory {


    private ICalculator calculator;
    private double memory;


    public void saveInMemory(double result) {
        this.memory = result;
    }


    public double loadFromMemory() {
        return this.memory;
    }


    public CalculatorWithMemory(ICalculator iCalculator) {
        this.calculator = iCalculator;
    }

    public double sum(double a, double b) {
        return calculator.sum(a, b);
    }


    public double subtraction(double a, double b) {
        return calculator.subtraction(a, b);
    }


    public double multiply(double a, double b) {
        return calculator.multiply(a, b);
    }


    public double divide(double a, double b) {
        return calculator.divide(a, b);
    }


    public double raiseDegree(double a, int b) {
        return calculator.raiseDegree(a, b);
    }


    public double module(double a) {
        return calculator.module(a);
    }


    public double squareRoot(double a) {
        return calculator.squareRoot(a);
    }

}
