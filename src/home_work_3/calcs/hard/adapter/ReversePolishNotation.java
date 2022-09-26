package home_work_3.calcs.hard.adapter;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithOperator;

import java.util.ArrayList;
import java.util.Stack;

public class ReversePolishNotation {

    private static final CalculatorWithOperator calculator = new CalculatorWithOperator();


    /**
     * The method defines priority of the passed operator.
     */
    private static int getSymbolPriority(String operator) {
        if (operator.equals("^")) return 4;
        if (operator.equals("*") || operator.equals("/")) return 3;
        if (operator.equals("+") || operator.equals("-")) return 2;
        else return 0;
    }


    /**
     * The method puts the operator on the stack based on the logic of the Reverse Polish Notation.
     */
    private static void insertOperatorInStack(Stack<String> stack, String operator, ArrayList<String> arrayList) {
        while (!stack.empty()) {
            if (getSymbolPriority(stack.peek()) >= getSymbolPriority(operator)) {
                arrayList.add(stack.pop());
            } else {
                break;
            }
        }
    }


    /**
     * The method converts the expression to Reverse Polish Notation.
     *
     * @param expression source string.
     * @return PRN-string.
     */
    private static ArrayList<String> expressionToRPN(String expression) {

        expression = expression.replaceAll(" ", "");

        char[] array = expression.toCharArray();

        ArrayList<String> current = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        StringBuilder completeDigit = new StringBuilder("");
        String operator = "";

        for (int i = 0; i < array.length; i++) {

            if ((Character.isDigit(array[i])) || (array[i] == '.')) {
                completeDigit.append(array[i]);
            }

            if ((!Character.isDigit(array[i])) && (!(array[i] == '.'))) {
                current.add(completeDigit.toString());
                completeDigit = new StringBuilder("");
                operator = String.valueOf(array[i]);

                insertOperatorInStack(stack, operator, current);

                stack.push(operator);
            }

            if (i == array.length - 1) {
                current.add(completeDigit.toString());
            }
        }

        while (!stack.empty()) {
            current.add(stack.pop());
        }

        return current;
    }


    /**
     * The method solves the mathematical expression that is written
     * in Reverse Polish Notation.
     *
     * @param rpn expression in RPN.
     * @return result.
     */
    private static double RPNtoResult(ArrayList<String> rpn) {

        Stack<String> sourceStack = new Stack<>();

        for (int i = rpn.size() - 1; i >= 0; i--) {
            sourceStack.push(rpn.get(i));
        }

        Stack<String> resultStack = new Stack<>();

        while (!sourceStack.empty()) {
            String current = sourceStack.pop();

            if (!isOperator(current)) {
                resultStack.push(current);
            } else {
                double operandTwo = Double.parseDouble(resultStack.pop());
                double operandOne = Double.parseDouble(resultStack.pop());

                double result = switch (current) {
                    case ("+") -> calculator.sum(operandOne, operandTwo);
                    case ("-") -> calculator.subtraction(operandOne, operandTwo);
                    case ("/") -> calculator.divide(operandOne, operandTwo);
                    case ("*") -> calculator.multiply(operandOne, operandTwo);
                    case ("^") -> calculator.raiseDegree(operandOne, (int) operandTwo);
                    default -> 0;
                };

                resultStack.push(String.valueOf(result));
            }
        }

        return Double.parseDouble(resultStack.pop());
    }


    private static boolean isOperator(String text) {
        return text.equals("+") || text.equals("-") || text.equals("*") || text.equals("/") || text.equals("^");
    }


    public static double calculate(String source) {
        return RPNtoResult(expressionToRPN(source));
    }

}
