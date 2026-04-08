package sprint_1;

import java.util.Scanner;

public class Question_18 {
    static void main(String[] args) {
        System.out.println("Write a program to generate multiplication tables for a given number.");
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if(!input.hasNextInt()){
            System.out.println("Enter a valid number");
            return;
        }
        int num = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
