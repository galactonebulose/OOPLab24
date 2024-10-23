package LabExercises.Lab9Additional;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input telephone number
        System.out.print("Enter phone number in the format (555) 555-5555: ");
        String phoneNumber = scanner.nextLine();

        // Extract area code, first three digits, and last four digits
        String areaCode = phoneNumber.substring(1, 4); // Extracting the area code without parentheses
        String firstThreeDigits = phoneNumber.substring(6, 9); // First three digits
        String lastFourDigits = phoneNumber.substring(10); // Last four digits

        // Display the extracted parts
        System.out.println("Area Code: " + areaCode);
        System.out.println("Phone Number: " + firstThreeDigits + "-" + lastFourDigits);

        scanner.close();
    }
}

