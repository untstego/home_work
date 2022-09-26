package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {


    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathCopy calculatorWithMathCopy;
    private CalculatorWithMathExtends calculatorWithMathExtends;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculatorWithOperator) {
        this.calculatorWithOperator = calculatorWithOperator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculatorWithMathExtends) {
        this.calculatorWithMathExtends = calculatorWithMathExtends;
    }

    private int countOperation;

    private void IncCountOperation() {
        this.countOperation++;
    }

    public long getCountOperation() {
        return countOperation;
    }



    public double sum(double a, double b) {
        IncCountOperation();

        if (this.calculatorWithMathCopy == null && this.calculatorWithMathExtends == null) {
            return this.calculatorWithOperator.sum(a, b);
        } else if (this.calculatorWithMathCopy == null && this.calculatorWithOperator == null) {
            return this.calculatorWithMathExtends.sum(a, b);
        } else {
            return this.calculatorWithMathCopy.sum(a, b);
        }

    }

    public double subtraction(double a, double b) {
        IncCountOperation();
        if (this.calculatorWithMathCopy == null && this.calculatorWithMathExtends == null) {
            return this.calculatorWithOperator.subtraction(a, b);
        } else if (this.calculatorWithMathCopy == null && this.calculatorWithOperator == null) {
            return this.calculatorWithMathExtends.subtraction(a, b);
        } else {
            return this.calculatorWithMathCopy.subtraction(a, b);
        }
    }


    public double multiply(double a, double b) {
        IncCountOperation();

        if (this.calculatorWithMathCopy == null && this.calculatorWithMathExtends == null) {
            return this.calculatorWithOperator.multiply(a, b);
        } else if (this.calculatorWithMathCopy == null && this.calculatorWithOperator == null) {
            return this.calculatorWithMathExtends.multiply(a, b);
        } else {
            return this.calculatorWithMathCopy.multiply(a, b);
        }
    }


    public double divide(double a, double b) {
        IncCountOperation();

        if (this.calculatorWithMathCopy == null && this.calculatorWithMathExtends == null) {
            return this.calculatorWithOperator.divide(a, b);
        } else if (this.calculatorWithMathCopy == null && this.calculatorWithOperator == null) {
            return this.calculatorWithMathExtends.divide(a, b);
        } else {
            return this.calculatorWithMathCopy.divide(a, b);
        }
    }

    public double raiseDegree(double a, int b) {
        IncCountOperation();
        if (this.calculatorWithMathCopy == null && this.calculatorWithMathExtends == null) {
            return this.calculatorWithOperator.raiseDegree(a, b);
        } else if (this.calculatorWithMathCopy == null && this.calculatorWithOperator == null) {
            return this.calculatorWithMathExtends.raiseDegree(a, b);
        } else {
            return this.calculatorWithMathCopy.raiseDegree(a, b);
        }
    }

    public double module(double a) {
        IncCountOperation();

        if (this.calculatorWithMathCopy == null && this.calculatorWithMathExtends == null) {
            return this.calculatorWithOperator.module(a);
        } else if (this.calculatorWithMathCopy == null && this.calculatorWithOperator == null) {
            return this.calculatorWithMathExtends.module(a);
        } else {
            return this.calculatorWithMathCopy.module(a);
        }
    }

    public double squareRoot(double a) {
        IncCountOperation();

        if (this.calculatorWithMathCopy == null && this.calculatorWithMathExtends == null) {
            return this.calculatorWithOperator.squareRoot(a);
        } else if (this.calculatorWithMathCopy == null && this.calculatorWithOperator == null) {
            return this.calculatorWithMathExtends.squareRoot(a);
        } else {
            return this.calculatorWithMathCopy.squareRoot(a);
        }
    }
}
