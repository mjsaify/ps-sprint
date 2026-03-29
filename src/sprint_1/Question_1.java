package sprint_1;

import java.util.Scanner;

public class Question_1 {
    static void main(String[] args) {
        System.out.println("Check if a number is Even or Odd");
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a Number: ");
        // Check if the input is a number
        if (!input.hasNextInt()) {
            System.out.println("Please enter a valid number");
            return;
        }
        int num = input.nextInt();
        boolean result = checkNumber(num);
        if(!result){
            System.out.println(num + " is an Odd Number.");
        }else{
            System.out.println(num + " is an Even Number.");
        }
    }
    static boolean checkNumber(int num){
        return num % 2 == 0;
    }
}
