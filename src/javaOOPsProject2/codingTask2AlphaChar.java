package javaOOPsProject2;
/*
Find out how many alpha characters are present in a string?
 */
public class codingTask2AlphaChar {
    public static void main(String[] args) {

        String word ="I Love Java So Much";

        System.out.println("*****USING FOR LOOP*****");

        int count =0;

        for (int i = 0; i < word.length(); i++) { // It initializes a loop counter i to 0, continues the loop as long as i is less than the length of the string word, and increments i by 1 after each iteration.
                if(word.charAt(i) != ' '){ // this will check if the character at position 'i' in the string "word" is not a whitespace character
                    count++; // count is incremented by 1.
                }
        }
        System.out.println("Alpha Characters: "+count);

        System.out.println("*****USING LENGTH METHOD WILL INCLUDE WHITESPACES*****");

        int charCount = word.length(); // this will count the characters including the whitespaces
        System.out.println("Alpha Characters: "+charCount);



    }
}
