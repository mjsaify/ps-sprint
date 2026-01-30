package sprint_1;

import java.util.Scanner;

public class Question_1 {
    static void main(String[] args) {
        // Write a program to check whether a number is even or odd.

        System.out.print("Input a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
}