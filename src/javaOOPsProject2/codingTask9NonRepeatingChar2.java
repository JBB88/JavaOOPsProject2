package javaOOPsProject2;
/*
Find the First Non-Repeating Character in a String: Given a string, find and
return the first non-repeating character. For example, in the string
"abracadabra", the first non-repeating character is 'c'.
 */
public class codingTask9NonRepeatingChar2 {
    public static void main(String[] args) {
        int[] charCount = new int[26];
        String input = "abracadabra";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            charCount[ch - 'a']++;
        }

        char firstNonRepeating = '\0';

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (charCount[ch - 'a'] == 1) {
                firstNonRepeating = ch;
                break;
            }
        }

        if (firstNonRepeating != '\0') {
            System.out.println("The first non-repeating character is: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
