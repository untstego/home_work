package home_work_1;

import java.sql.SQLOutput;

public class StudyingMath {

    public static void main(String[] args) {
        areaOfCircle(15);
        squareRoot(144);
    }


    /**
     * Метод вычисляет площадь круга по переданному радиусу
     * и выводит итог в консоль
     */
    public static void areaOfCircle(double radius) {
        System.out.println("Transmitted radius: " + radius + "\n"
                         + "Area of Circle: " + Math.PI * Math.pow(radius, 2) + "\n");
    }


    /**
     * Метод вычисляет квадратный корень переданного числа
     * и выводит итог в консоль
     */
    public static void squareRoot(double number) {
        System.out.println("Transmitted number: " + number + "\n"
                         + "Square root: " + Math.sqrt(number) + "\n");
    }


}
