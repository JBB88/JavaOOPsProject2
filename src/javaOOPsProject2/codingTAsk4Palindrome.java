package javaOOPsProject2;
/*
Check if a String is Palindrome: Determine whether a given string is a
palindrome, which means it reads the same forwards and backward. For
example, "madam" is a palindrome.
 */
public class codingTAsk4Palindrome {
    public static void main(String[] args) {

        String input ="pop"; // declare a String variable 'input'
        StringBuilder stringBuilder = new StringBuilder(input); // create a StringBuilder object, initialize it with input string
        String output = stringBuilder.reverse().toString(); // to reverse the content of the StringBuilder
        System.out.println("output: "+output); // print the reversed string
        if(input.equals(output)){ // if condition to check if the input string is equal to the output or the reversed string, if equal it is a palindrome
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }


    }
}
