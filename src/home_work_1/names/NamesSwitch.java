package home_work_1.names;

import java.util.Scanner;

public class NamesSwitch {

    static String name;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        enterName(scanner);

        switch (name) {
            case ("Vasya"):
                System.out.println("Hello!");

            case ("Anastasia"):
                System.out.println("I've been waiting for you for so long.");
                break;

            default:
                System.out.println("Excuse me, who are you?");
                break;
        }


    }

    public static void enterName(Scanner scanner) {
        System.out.println("Say your name (ONLY LATIN ALPHABET)");
        name = scanner.next();
    }
}
