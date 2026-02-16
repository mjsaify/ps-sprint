package sprint_1;

import java.util.Scanner;

public class Question_2 {
    static void main(String[] args) {
        // Write a program to determine if a number is prime.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number to check whether its a prime: ");
        int num  = input.nextInt();

        // My Attempt
//        int count = 2;
//        while(count < num){
//            if(count % num == 0){
//                System.out.println(num + " is a prime number");
//            }
//            count++;
//        }

        // Correct Solution
        if(num <= 1){
            System.out.println(num + " is not a prime number");
            return;
        }

        int count = 2;
        boolean isPrime = true;

        while(count < num){
            if(num % count == 0){
                isPrime = false;
                break;
            }
            count++;
        }

        if(isPrime){
            System.out.println(num + " is a prime number");
        }else {
            System.out.println(num + " is not a prime number");
        }
    }
}
