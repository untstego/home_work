package home_work_3.calcs.hard.adapter.handlers;

public class NegativeNumberHandler {

    public static String handleNegativeNumber(String source) {
        StringBuilder stringBuilder = new StringBuilder(source);
        return stringBuilder.charAt(0) == '-' ? stringBuilder.insert(0, '0').toString() : source;
    }

}
