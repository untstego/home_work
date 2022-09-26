package home_work_3.calcs.hard.adapter.handlers;

import home_work_3.calcs.hard.adapter.ReversePolishNotation;
import home_work_3.calcs.simple.CalculatorWithOperator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModuleOpener {

    private static final CalculatorWithOperator calculator = new CalculatorWithOperator();




    public String searchAndOpenModule(String source) {
         return openModule(searchModule(source));
    }


    public static String searchModule(String source) {
        StringBuilder stringBuilder = new StringBuilder(source);
        Pattern pattern = Pattern.compile("\\|[^\\|]*\\|");
        Matcher matcher = pattern.matcher(source);



        while (matcher.find()) {
            int startIndex = matcher.start();
            int endIndex = matcher.end();

            stringBuilder.replace(startIndex, endIndex, openModule(stringBuilder.substring(startIndex, endIndex)));

        }


        return stringBuilder.toString();
    }


    /**
     * The method opens an expression in the module.
     * @param source expression in module signs.
     * @return
     */
    private static String openModule(String source) {
        StringBuilder stringBuilder = new StringBuilder(source);
        stringBuilder.deleteCharAt(0);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        double sourceDouble = ReversePolishNotation.calculate(stringBuilder.toString());
        return String.valueOf(calculator.module(sourceDouble));
    }
}
