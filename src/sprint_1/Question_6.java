package sprint_1;

import java.util.Objects;
import java.util.Scanner;

public class Question_6 {
    static void main(String[] args) {
        System.out.println("Write a program to check if a string or number is a palindrome.");
        System.out.println();

        // Solution
        Scanner i = new Scanner(System.in);
        System.out.print("Enter a number or a word: ");

        if(checkPalindrome(i.nextLine())){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }

    static boolean checkPalindrome(String value){
        StringBuilder builder = new StringBuilder(value);
        builder.reverse();
        String reversed = builder.toString();
        return reversed.equals(value);
    }
}
