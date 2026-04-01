package sprint_1;

import java.util.Scanner;

public class Question_5 {
    static void main(String[] args) {
        System.out.println("Write a program to generate the Fibonacci series up to a given number.");
        System.out.println();

        System.out.print("Enter a Number: ");
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 0; i <= limit; i++) {
            int next = a + b;
            a = b;
            b = next;
            System.out.println(next);
        }
    }
}
