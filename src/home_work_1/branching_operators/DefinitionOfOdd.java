package home_work_1.branching_operators;

public class DefinitionOfOdd {
    public static void main(String[] args) {
        calcAndOutput(15);
        calcAndOutput(4);
        calcAndOutput(147965);
    }


    /**
     * Метод определяет нечётность числа.
     *
     * @return true, если переданное число нечётное.
     */
    public static boolean definitionOfOdd(int source) {
        return source % 2 != 0;
    }


    /**
     * Метод определяет нечётность числа и выводит информацию об операции
     * в консоль.
     */
    public static void calcAndOutput(int source) {

        System.out.println("Transmitted number: " + source + "\n"
                         + "The number is " + (definitionOfOdd(source) ? "odd" : "even") + "\n");
    }
}
