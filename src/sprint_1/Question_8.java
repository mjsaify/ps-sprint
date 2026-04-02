package sprint_1;

import java.util.Scanner;

public class Question_8 {
    static void main(String[] args) {
        System.out.println("Write a program to compute the factorial of a given number.");
        System.out.println();

        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        if(!input.hasNextInt()){
            System.out.println("Enter a valid number");
            return;
        }

        int num = input.nextInt();
        int result = 1;
        for (int i = num; i >= 1; i--) {
            result = result * i;
        }
        System.out.println(result);
    }
}
