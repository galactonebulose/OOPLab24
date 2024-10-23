package LabExercises.Lab9Additional;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the five-letter word from the user
        System.out.print("Enter a five-letter word: ");
        String word = scanner.nextLine().toLowerCase();

        // Check if the input is a five-letter word
        if (word.length() != 5) {
            System.out.println("Please enter a word with exactly 5 letters.");
            return;
        }

        // Array to store generated three-letter words (up to 60 possible combinations)
        String[] threeLetterWords = new String[60];
        int count = 0;

        // Generate all possible three-letter combinations
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (i != j && j != k && i != k) {
                        String threeLetterWord = "" + word.charAt(i) + word.charAt(j) + word.charAt(k);

                        // Add word if it is unique (check for duplicates)
                        if (!isDuplicate(threeLetterWords, threeLetterWord, count)) {
                            threeLetterWords[count] = threeLetterWord;
                            count++;
                        }
                    }
                }
            }
        }

        // Display all unique three-letter words
        System.out.println("All possible unique three-letter words:");
        for (int i = 0; i < count; i++) {
            System.out.println(threeLetterWords[i]);
        }

        scanner.close();
    }

    // Method to check if the word already exists in the array
    public static boolean isDuplicate(String[] array, String word, int count) {
        for (int i = 0; i < count; i++) {
            if (array[i].equals(word)) {
                return true; // Duplicate found
            }
        }
        return false; // No duplicates found
    }
}
