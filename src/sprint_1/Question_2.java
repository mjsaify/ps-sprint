package sprint_1;

import java.util.Scanner;

public class Question_2 {
    static void main(String[] args) {
        System.out.println("Write a program to determine if a number is prime.");
        System.out.println();

        System.out.print("Enter a Number: ");
        Scanner input = new Scanner(System.in);
        int count = 2;

        if(isPrime(input.nextInt(), count)){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a Prime Number");
        }

    }

    static boolean isPrime(int num, int count){
        if(num <= 1){
            return false;
        }else{
            while(count < num){
                if(num % count == 0){
                    return false;
                }
                count++;
            }
            return true;
        }
    }
}
