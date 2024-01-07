package javaOOPsProject2;
/*
You have a list of strings and you want to keep only those that start with
“A” and you want to return them in lower case".
 */
public class codingTask8KeepStartWithA {
    public static void main(String[] args) {
        String[] originalStrings = {"America", "Barcelona", "Africa", "Orlando", "Argentina"};
        int count = 0;

        // Count the number of strings starting with "A"
        for (String str : originalStrings) {
            if (str.startsWith("A")) {
                count++;
            }
        }

        // Create a new array to store the filtered strings
        String[] filteredStrings = new String[count];

        // Populate the filtered array with lowercase strings starting with "A"
        int index = 0;
        for (String str : originalStrings) {
            if (str.startsWith("A")) {
                filteredStrings[index++] = str.toLowerCase();
            }
        }

        // Print the filtered strings
        System.out.println("Filtered Strings:");
        for (String str : filteredStrings) {
            System.out.println(str);
        }
    }
}
