package LabExercises.Lab10Additional;

import java.util.Scanner;

class MarksOutOfBoundsException extends Exception {
    public MarksOutOfBoundsException(String message) {
        super(message);
    }
}

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) throws MarksOutOfBoundsException {
        this.name = name;
        setMarks(marks);
    }

    public void setMarks(int marks) throws MarksOutOfBoundsException {
        if (marks > 100) {
            throw new MarksOutOfBoundsException("Marks cannot exceed 100: " + marks);
        }
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks (0-100): ");
        int marks = scanner.nextInt();

        try {
            Student student = new Student(name, marks);
            System.out.println("Student: " + student.getName() + ", Marks: " + student.getMarks());
        } catch (MarksOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
