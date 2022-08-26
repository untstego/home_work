package home_work_1.names;

import java.util.Objects;
import java.util.Scanner;

public class NamesIfElseIf {

    static String name;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        enterName(scanner);

        if (Objects.equals(name, "Vasya")) {
            System.out.println("Hello!");
            System.out.println("I've been waiting for you for so long.");
        } else if (Objects.equals(name, "Anastasia")) {
            System.out.println("I've been waiting for you for so long.");
        } else {
            System.out.println("Excuse me, who are you?");
        }


    }

    public static void enterName(Scanner scanner) {
        System.out.println("Say your name");
        name = scanner.next();
    }
}
