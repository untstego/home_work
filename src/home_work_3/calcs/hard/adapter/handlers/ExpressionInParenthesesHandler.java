package home_work_3.calcs.hard.adapter.handlers;

public class ExpressionInParenthesesHandler {

    public static String searchExpressionInFramingOperators(String source) {

        char[] array = source.toCharArray();
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == '(') {
                startIndex = i;
            } else if (array[i] == ')') {
                endIndex = i;
                break;
            }
        }

        return source.substring(startIndex + 1, endIndex);
    }
}
