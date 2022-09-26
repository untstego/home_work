package home_work_3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    @Override
    public double raiseDegree(double a, int b) {
        return Math.pow(a, b);
    }


    @Override
    public double module(double a) {
        return Math.abs(a);
    }


    @Override
    public double squareRoot(double a) {
        return Math.sqrt(a);
    }
}
