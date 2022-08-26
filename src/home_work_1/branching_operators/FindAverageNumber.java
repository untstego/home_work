package home_work_1.branching_operators;

public class FindAverageNumber {

    public static void main(String[] args) {

        findAverage(2, 7.18, 12);
        findAverage(3, 3, 12);
        findAverage(1, -15.2, 44.187);
        findAverage(-2.35, 3.14, 178);

    }


    /**
     * Метод принимает три числа и ищет среди них среднее. После — вызывает метод, который выведет
     * в консоль информацию об операции.
     */
    public static void findAverage(double first, double second, double third) {
        Double average = (double) 0;
        if ((first < second && first > third) || (first > second && first < third)) {
            average = first;
        } else if ((second < first && second > third) || (second > first && second < third)) {
            average = second;
        } else if ((third > second && third < first) || (third < second && third >first)) {
            average = third;
        } else {
            average = null;
        }

        enterAverageInConsole(first, second, third, average);
    }


    /**
     * Метод выводит в консоль информацию об операции
     */
    public static void enterAverageInConsole(double first, double second, double third, Double average) {

        if (average == null) {
            System.out.println("Sorry, could not determine the average number \n");
        } else {
            System.out.println("Transmitted numbers: " + first + ", " + second + ", " + third + ", ");
            System.out.println("Average number: " + average + "\n");
        }
    }

}
