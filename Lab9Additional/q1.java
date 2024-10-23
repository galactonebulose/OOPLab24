package LabExercises.Lab9Additional;

import java.util.Scanner;
import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of strings
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Create an array to store strings
        String[] strings = new String[n];

        // Accept strings from the user
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }

        // Sort the array of strings in alphabetical order
        Arrays.sort(strings);

        // Display the sorted strings
        System.out.println("Strings in alphabetical order:");
        for (String str : strings) {
            System.out.println(str);
        }

        scanner.close();
    }
}
