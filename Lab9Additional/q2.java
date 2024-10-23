package LabExercises.Lab9Additional;

import java.util.Scanner;

class Student {
    String regNo;
    String firstName;
    String lastName;
    String degree;

    // Constructor to initialize student details
    public Student(String regNo, String firstName, String lastName, String degree) {
        this.regNo = regNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.degree = degree;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Registration Number: " + regNo);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Degree: " + degree);
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to hold 10 students
        Student[] students = new Student[10];

        // Accept user input for 10 students
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for student " + (i + 1));

            System.out.print("Enter Registration Number: ");
            String regNo = scanner.nextLine();

            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter Degree: ");
            String degree = scanner.nextLine();

            // Create and store each student object
            students[i] = new Student(regNo, firstName, lastName, degree);
            System.out.println();  // Blank line for better formatting
        }

        // User inputs to search by first name or last name
        System.out.print("Search student by (1) First Name or (2) Last Name? Enter 1 or 2: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            System.out.print("Enter First Name to search: ");
            String firstNameSearch = scanner.nextLine();
            boolean found = false;

            // Searching by first name
            for (Student student : students) {
                if (student.firstName.equalsIgnoreCase(firstNameSearch)) {
                    student.displayDetails();
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No student found with the First Name: " + firstNameSearch);
            }
        } else if (choice == 2) {
            System.out.print("Enter Last Name to search: ");
            String lastNameSearch = scanner.nextLine();
            boolean found = false;

            // Searching by last name
            for (Student student : students) {
                if (student.lastName.equalsIgnoreCase(lastNameSearch)) {
                    student.displayDetails();
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No student found with the Last Name: " + lastNameSearch);
            }
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }
}

