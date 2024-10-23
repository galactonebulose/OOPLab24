package LabExercises.Lab10Additional;

import java.util.Scanner;

class EvenNumberException extends Exception {
    public EvenNumberException(String message) {
        super(message);
    }
}

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            checkEvenNumber(number);
        } catch (EvenNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void checkEvenNumber(int number) throws EvenNumberException {
        if (number % 2 == 0) {
            throw new EvenNumberException("The number " + number + " is even.");
        } else {
            System.out.println("The number " + number + " is odd.");
        }
    }
}

