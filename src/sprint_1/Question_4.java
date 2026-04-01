package sprint_1;

import java.util.Scanner;

public class Question_4 {
    static void main(String[] args) {
        // NOTE: In Java, when you divide an int by another int, the result is also an int. This means the computer discards the remainder (the decimal part) rather than rounding it.
        // EX: 123/10 = 12.3, Java rule, it removes .3, it only returns 12
        System.out.println("Write a program to check if a number is an Armstrong number.");
        System.out.println();

        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        if(!input.hasNextInt()){
            System.out.println("Enter a valid Armstrong number");
            return;
        }

        int num = input.nextInt();
        int originalNum = num;
        int sum = 0;
        while(num > 0){
            int n = num % 10;
            num = num / 10;
            int cube = n * n * n;
            sum += cube;
        }
        if(sum == originalNum){
            System.out.println("It is an Armstrong number");
        }else {
            System.out.println("No, It's not an Armstrong number");
        }
    }
}
