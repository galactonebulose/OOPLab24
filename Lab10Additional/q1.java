package LabExercises.Lab10Additional;

import java.util.Scanner;

class Input_Exception extends Exception {
    public Input_Exception(String message) {
        super(message);
    }
}

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String input="";

        System.out.println("Enter integers to sum them up. Enter -1 to finish:");

        while (true) {
            try {
                System.out.print("Enter a number: ");
                input = scanner.nextLine();

                if (input.isEmpty()) {
                    throw new Input_Exception("Input cannot be empty.");
                }

                int number = Integer.parseInt(input);

                if (number == -1) {
                    break;
                }

                sum += number;

            } catch (NumberFormatException e) {
                try {
                    Double.parseDouble(input);
                    throw new Input_Exception("Floating point numbers are not allowed.");
                } catch (NumberFormatException ex) {
                    System.out.println("Invalid input. Please enter an integer.");
                } catch (Input_Exception ie) {
                    System.out.println(ie.getMessage());
                }
            } catch (Input_Exception ie) {
                System.out.println(ie.getMessage());
            }
        }

        System.out.println("Sum of entered integers: " + sum);
        scanner.close();
    }
}
