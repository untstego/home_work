package home_work_1;

public class StudyingPriorityOperators {

    static int a = 2;
    static int b = 8;


    public static void main(String[] args) {

        int result = 0;

        result = 5 + 2 / 8;
        outputAndReturn(2.1, 5, result);

        result = (5 + 2) / 8;
        outputAndReturn(2.2, 0, result);

        result = (5 + a++) / b;
        outputAndReturn(2.3, 0, result);

        result = (5 + a++) / --b;
        outputAndReturn(2.4, 1, result);

        result = (5 * 2 >> a++) / --b;
        outputAndReturn(2.5, 0,result);

        result = (5 + 7 > 20 ? 68 : 22 * 2 >> a++) / --b;
        outputAndReturn(2.6, 1, result);

        // Пункт 2.7. Ошибка компиляции. Блок true тернарного оператора
        // подразумевает возврат значения boolean, которое необходимо
        // чему-то присвоить.
        // result = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> a++) / --b;


        // Пункт 2.8. Ошибка компиляции. Условие задачи подразумевает
        // операцию между boolean и целочисленными значениями.
        // result = 6 - 2 > 3 && 12 * 12 <= 119;

        boolean exam2_9 = true && false;
        outputBooleanAndReturn(2.9, false, exam2_9);

    }


    /**
     * Метод возвращает статические переменные
     * к их исходным значениям.
     */
    public static void returnVariablesToOrigValues() {
        a = 2;
        b = 8;
    }

    /**
     * Метод выводит в консоль необходимую информацию об предшествующей операции
     * с целочисленными значениями.
     * @param operationNumber порядковый номер задания
     * @param expectedNumb ожидаемый мною результат
     * @param result действительный результат
     */
    public static void outputToConsole(double operationNumber, int expectedNumb, int result) {
        System.out.println("Operation number: " + operationNumber + "\n"
                            + "Expected result: " + expectedNumb + "\n"
                            + "Valid result: " + result + "\n");
    }


    /**
     * Метод выводит в консоль необходимую информацию об предшествующей операции
     * с boolean значениями.
     * @param operationNumber порядковый номер задания
     * @param expectedNumb ожидаемый мною результат
     * @param result действительный результат
     */
    public static void outputBooleanExamToConsole(double operationNumber, boolean expectedNumb, boolean result) {
        System.out.println("Operation number: " + operationNumber + "\n"
                + "Expected result: " + expectedNumb + "\n"
                + "Valid result: " + result + "\n");
    }


    /**
     * Метод объединяет работу других методов (вывод информации о целочисленных операциях в консоль
     * и обнуление переменных) для разгрузки main.
     */
    public static void outputAndReturn(double operationNumber, int expectedNumb, int result) {
        outputToConsole(operationNumber, expectedNumb, result);
        returnVariablesToOrigValues();
    }


    /**
     * Метод объединяет работу других методов (вывод информации о boolean операциях в консоль
     * и обнуление переменных) для разгрузки main.
     */
    public static void outputBooleanAndReturn(double operationNumber, boolean expectedNumb, boolean result) {
        outputBooleanExamToConsole(operationNumber, expectedNumb, result);
        returnVariablesToOrigValues();
    }
}
