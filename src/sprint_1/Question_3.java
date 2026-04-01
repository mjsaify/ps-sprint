package sprint_1;

import java.util.Scanner;

public class Question_3 {
    static void main(String[] args) {
        System.out.println("Write a program to check if a given year is a leap year.");
        System.out.println();

        System.out.print("Enter a Year: ");
        Scanner input = new Scanner(System.in);
        if(!input.hasNextInt()){
            System.out.println("Enter a valid number");
            return;
        }
        int num = input.nextInt();
        if(checkLeapYear(num)){
            System.out.println(num + " is a Leap Year");
        }else{
            System.out.println(num + " is not a Leap Year");
        }
    }
    static boolean checkLeapYear(int year){
        if(year % 4 == 0){
            if(year % 100 == 0){
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}
