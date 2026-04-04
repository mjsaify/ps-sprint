package sprint_1;

import java.util.Scanner;

public class Question_13 {
    static void main(String[] args) {
        System.out.println("Write a program to reverse a given string.");
        System.out.println();

        System.out.print("Type a word reverse it: ");
        Scanner input = new Scanner(System.in);
        if(!input.hasNext()){
            System.out.println("Please enter a valid string");
            return;
        }

        String text = input.next().toLowerCase();
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            char textChar = text.toCharArray()[i];
            reversed += textChar;
        }
        System.out.println(reversed);
    }
}
