package home_work_1.branching_operators;

public class LetterOrOtherSymbol {

    public static void main(String[] args) {
        isLetCons('-');
        isLetCons('A');
        isLetCons('=');
        isLetCons('3');
        isLetCons('B');
        isLetCons('x');
        isLetCons('*');
    }


    /**
     * Проверяет, является ли символ буквой.
     *
     * @param character любой символ.
     * @return булево значение (если true, символ — буква).
     */
    public static boolean isLet(char character) {
        if (!(character >= 'A' && character <= 'Z') && !(character >= 'a' && character <= 'z')) {
            return false;
        } else {
            return true;
        }
    }


    /**
     * Использует логику метода isLet, выводит в консоль результат работы метода.
     */
    public static void isLetCons(char character) {
        System.out.println("Transmitted symbol: " + character);
        System.out.println("It's a letter? " + isLet(character));
        System.out.println();
    }

}
