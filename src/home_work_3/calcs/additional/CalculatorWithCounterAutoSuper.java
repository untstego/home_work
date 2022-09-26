package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private int countOperation = 0;

    @Override
    public double raiseDegree(double a, int b) {
        countOperation++;
        return super.raiseDegree(a, b);
    }

    @Override
    public double module(double a) {
        countOperation++;
        return super.module(a);
    }

    @Override
    public double squareRoot(double a) {
        countOperation++;
        return super.squareRoot(a);
    }

    @Override
    public double sum(double a, double b) {
        countOperation++;
        return super.sum(a, b);
    }

    @Override
    public double subtraction(double a, double b) {
        countOperation++;
        return super.subtraction(a, b);
    }

    @Override
    public double multiply(double a, double b) {
        countOperation++;
        return super.multiply(a, b);
    }

    @Override
    public double divide(double a, double b) {
        countOperation++;
        return super.divide(a, b);
    }


    public long getCountOperation() {
        return this.countOperation;
    }
}
