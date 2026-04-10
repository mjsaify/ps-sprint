package sprint_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question_20 {
    static void main(String[] args) {
        System.out.println("Write a program to determine if a number is a perfect number.");
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        if (!input.hasNextInt()) {
            System.out.println("Please Enter a valid number");
            return;
        }

        int number = input.nextInt();
        int total = 0;
        List<Integer> divisors = new ArrayList<Integer>();

        for (int i = 1; i < number; i++) {
            boolean isDivisible = number % i == 0;
            if (isDivisible) {
                divisors.add(i);
                total += i;
            }
        }
        if (total == number) {
            System.out.println(number + " is perfect number.");
            System.out.println("Divisors are: " + divisors);
        } else {
            System.out.println(number + " is not a perfect number.");
        }

    }
}
