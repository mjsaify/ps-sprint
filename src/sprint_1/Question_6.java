package sprint_1;

import java.util.Scanner;

public class Question_6 {
    static void main(String[] args) {
        System.out.println("Write a program to check if a string or number is a palindrome.");
        System.out.println();

        System.out.print("Type Number or a Word to check if it is a Palindrome: ");
        Scanner input = new Scanner(System.in);
        String original = input.next().toLowerCase();
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        System.out.println(reversed);
        if(original.equals(reversed)){
            System.out.println("It is a Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
