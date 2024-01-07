package javaOOPsProject2;
/*
Find the First Non-Repeating Character in a String: Given a string, find and
return the first non-repeating character. For example, in the string
"abracadabra", the first non-repeating character is 'c'.
 */
public class codingTask9NonRepeatingChar {
    public static char findFirstNonRepeatingChar(String str) {
        // Create an array to store the count of each character
        int[] charCount = new int[120];

        // Traverse the string and count the occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        // Traverse the string again and find the first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        // If no non-repeating character is found, return a default value (e.g., '\0')
        return '\0';
    }

    public static void main(String[] args) {
        String inputString = "alapaap";
        char result = findFirstNonRepeatingChar(inputString);

        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }
    }

}
