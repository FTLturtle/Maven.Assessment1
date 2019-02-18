package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        String[] arrayOfSubStrings = getArrayOfAllSubstrings(input);
        int countOfPalindromes = input.length();

        for (String s : arrayOfSubStrings) {
            if (isPalindrome(s)) {
                countOfPalindromes++;
            }
        }

        return countOfPalindromes;
    }

    private static String[] getArrayOfAllSubstrings(String input) {
        int arraySize = (input.length() + 1) * input.length() / 2 - input.length();
        // The number of distinct non-empty substrings in a string (including the full string) is equal to the sum of
        // all integers from 1 up to the number of characters in the string. Using Euler's method of summing numbers
        // from 1 to n, we can reduce this to a simple equation. (n + 1) * (n / 2)

        String[] arrayOfSubstrings = new String[arraySize]; // initializing the array to the correct size
        int index = 0; // keeping track of next index

        // The following nested for loop iterates through every possible substring and assigns each one to the arrayOfSubstrings
        for (int startIndex = 0; startIndex < input.length(); startIndex++) {
            for (int endIndex = startIndex + 2; endIndex <= input.length(); endIndex++){
                arrayOfSubstrings[index] = input.substring(startIndex, endIndex);
                index++;
            }
        }

        return arrayOfSubstrings;
    }

    /**
     * Checks to see if the input String is a palindrome
     *
     * @param input string to check to see if its a palindrome
     * @return true if the input String is a palindrome, false otherwise
     */
    private static boolean isPalindrome(String input) {

            StringBuilder reverser = new StringBuilder(input);
            String reversedString = reverser.reverse().toString();

            if (input.equals(reversedString)) {
                return true;
            }

        return false;
    }
}
