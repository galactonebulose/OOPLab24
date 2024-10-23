package LabExercises.Lab10Additional;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        try {
            if (size < 0) {
                throw new NegativeArraySizeException("Array size cannot be negative: " + size);
            }

            int[] array = new int[size]; // Array creation with the given size
            System.out.println("Array of size " + size + " created successfully.");

        } catch (NegativeArraySizeException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

