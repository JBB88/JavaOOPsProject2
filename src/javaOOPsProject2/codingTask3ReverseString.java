package javaOOPsProject2;
//Reverse a String: Write a function to reverse a given string. For example,
//given the input "Hello", the output should be "olleH":
public class codingTask3ReverseString {
    public static void main(String[] args) {
        String str="Syntax";
        String result="";
        for(int i=str.length()-1;i>=0;i--)
            result=result+str.charAt(i);
        System.out.println(result);
    }
}
