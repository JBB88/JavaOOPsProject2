package javaOOPsProject2;
/*
Create a method to count how many vowels are present in a string
“documentation”
 */
public class CodingTask6CountVowels {
    public static void main(String[] args) {

        String str ="documentation";
        int count = 0; // variable count to count number of vowels starting at index 0
        str = str.toLowerCase(); // this is to convert the character to lowercase

        // using for loop to iterate the string 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // to get each character and store it a variable of type ch
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){ // to check if the character is a vowel
                count ++;
            }

        }
        System.out.println("String documentation has "+count+" vowels in it.");

        
    }
}
