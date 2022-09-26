package home_work_3.calcs.hard.adapter.handlers;

import home_work_3.calcs.hard.adapter.enums.Constants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConstantaLocationHandler {

    /**
     * The method adds multiplication sign before constanta
     * if the constant is written close to the digit.
     *
     * @param source source string.
     * @return changed string.
     */
    public static String addMultiplicationSignInStart(String source) {

        StringBuilder changingString = new StringBuilder(source);

        for (Constants constanta : Constants.getAllConstants()) {
            Pattern pattern = Pattern.compile(constanta.getLetterForm());
            Matcher matcher = pattern.matcher(changingString.toString());

            while (matcher.find()) {
                if (Character.isDigit(changingString.charAt(matcher.start() - 1))) {
                    changingString.insert(matcher.start(), "*");
                    matcher = pattern.matcher(changingString.toString());
                }
            }
        }
        return changingString.toString();
    }


    /**
     * The method adds multiplication sign after constanta
     * if the constant is written close to the digit.
     *
     * @param source source string.
     * @return changed string.
     */
    public static String addMultiplicationSignInFinish(String source) {

        StringBuilder changingString = new StringBuilder(source);

        for (Constants constanta : Constants.getAllConstants()) {
            Pattern pattern = Pattern.compile(constanta.getLetterForm());
            Matcher matcher = pattern.matcher(changingString.toString());

            while (matcher.find()) {
                if (Character.isDigit(changingString.charAt(matcher.end()))) {
                    changingString.insert(matcher.end(), "*");
                    matcher = pattern.matcher(changingString.toString());
                }
            }
        }
        return changingString.toString();
    }


    /**
     * The method uses the logic of the addMultiplicationSignInStart() and addMultiplicationSignInFinish()
     * and changed source string.
     * @param source source string.
     * @return changed string.
     */
    public static String addMultiplicationSign(String source) {

        source = addMultiplicationSignInStart(source);
        source = addMultiplicationSignInFinish(source);

        return source;
    }
}
