package javaOOPsProject2;
/*
Write a program to swap 2 numbers without a temporary variable?
 */
public class codingTask1SwapString {
    public static void main(String[] args) {
        String string1 = "Syntax";
        String string2 = "Java";

        System.out.println("Before the swap:");
        System.out.println("string1: " + string1);
        System.out.println("string2: " + string2);

        string1 = string1.concat(string2); // this will concatenate the two strings "SyntaxJava" ( length is 10)
        string2 = string1.substring(0, string1.length() - string2.length()); // use substring method to extract part of the string (0,10-4) -->"Syntax"
        string1 = string1.substring(string2.length()); // to extract "Java" from "SyntaxJava"



        System.out.println("After the swap:");
        System.out.println("string1: " + string1);
        System.out.println("string2: " + string2);

    }

}
