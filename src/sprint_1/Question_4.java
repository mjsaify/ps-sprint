package sprint_1;

import java.util.Scanner;

public class Question_4 {
    static void main(String[] args) {
        System.out.println("Write a program to check if a number is an Armstrong number");
        System.out.println();


        // My Attempt
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
//        int num = input.nextInt();
//
//        int count = 0;
//        String numToString = Integer.toString(num);
//        char[] numToArray = numToString.toCharArray();
//        int totalNum = 0;


//        for (int i = 1; i <= 3; i++) {
//            int cube = i * i * i; // Calculate the cube of the current number
//
//            // Print the result for each number
//            System.out.println("Number is : " + i + " and cube of " + i + " is : " + cube);
//        }


        // Solution
        int num = input.nextInt();
        int originalNum = num;
        int lengthOfNumber = String.valueOf(num).length();
        double result = 0;

         while (num > 0){
             int digit = num % 10;
             result = result + Math.pow(digit, lengthOfNumber);
             num = num / 10;
//             System.out.println(num); // int removes (truncates) the decimal part.
         }

         if(originalNum == result){
             System.out.println("Armstrong Number");
         }else {
             System.out.println("Not an Armstrong Number");
         }
    }
}
