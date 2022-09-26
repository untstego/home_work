package home_work_3.calcs.hard.adapter;

import home_work_3.calcs.hard.adapter.handlers.ConstantaLocationHandler;
import home_work_3.calcs.hard.adapter.handlers.ModuleOpener;
import home_work_3.calcs.hard.adapter.handlers.NegativeNumberHandler;

public class CalculatorStringExpression {

    public static void main(String[] args) {

     //   stringToRPN("12 + 1723 + 15 / 85 / 78");

        String test = "17+24PI*2+17E+19PI+PI12+E174+E478";
        System.out.println(ConstantaLocationHandler.addMultiplicationSign(test));


        String test2 = "2.2 + 14.9 - 14.2";
        String test3 = "15";


        System.out.println(ReversePolishNotation.calculate(test2));
        System.out.println(ReversePolishNotation.calculate(test3));



      /**  for (FramingOperators framingOperators : FramingOperators.getAllFramingOperators()) {
            System.out.println(searchExpressionInFramingOperators("17 + 18 + (|54+17| + (78/13)* 78)", framingOperators));
        }
       */

        System.out.println(NegativeNumberHandler.handleNegativeNumber("-185 + 49"));
        System.out.println(ModuleOpener.searchModule("17 + 18 + (|54+17| + |78/13| * 78"));




    }

}

