package javaOOPsProject2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
How can you remove all duplicates from ArrayList?
 */
public class codingTask10DuplicateArray {
    public static void main(String[] args) {
        ArrayList <String> items = new ArrayList<>();
        items.add("Ford");
        items.add("Toyota");
        items.add("Ford");
        items.add("Nissan");
        items.add("Honda");
        items.add("GMC");

        System.out.println("Before the removal of duplicates:");
        items.forEach(a-> System.out.println(a+" "));

        for (int i = 0; i < items.size(); i++) {
            for(int j = i+1; j < items.size(); j++ ){
                if(items.get(i).equals(items.get(j))){
                    items.remove(j);
                    j--;
                }
            }
        }
        System.out.println("After the removal of duplicates: ");
        items.forEach(b-> System.out.println(b+" "));
    }

}
