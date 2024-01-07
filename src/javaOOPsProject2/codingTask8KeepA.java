package javaOOPsProject2;

import java.util.ArrayList;
import java.util.List;

/*
You have a list of strings and you want to keep only those that start with
“A” and you want to return them in lower case".
 */
public class codingTask8KeepA {
    public static void main(String[] args) {
        // Sample list of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("America");
        stringList.add("Bahamas");
        stringList.add("Orlando");
        stringList.add("Argentina");
        stringList.add("Guatemala");

        // Filter strings starting with "A" and return them in lowercase
        List<String> filteredList = filterAndConvertToLowercase(stringList);

        // Display the result
        System.out.println("Original List: " + stringList);
        System.out.println("Filtered List (starting with 'A' in lowercase): " + filteredList);
    }

    public static List<String> filterAndConvertToLowercase(List<String> inputList) {
        List<String> result = new ArrayList<>();

        for (String str : inputList) {
            if (str.startsWith("A")) {
                result.add(str.toLowerCase());
            }
        }

        return result;
    }
}
