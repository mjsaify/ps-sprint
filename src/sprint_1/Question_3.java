package sprint_1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.YearMonth;
import java.util.Scanner;

public class Question_3 {
    static void main(String[] args) {
        System.out.println("Write a program to check if a given year is a leap year.");
        System.out.println();

        // My Solution
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
//        boolean isLeapYear = false;
//        int totalMonthDays = 0;
//
//        for (int i = 1; i <= 12; i++) {
//            YearMonth myYearMonth = YearMonth.of(year, i);
//            totalMonthDays += myYearMonth.lengthOfMonth();
//            if(totalMonthDays > 365){
//                isLeapYear = true;
//            }
//        }
//
//        if(!isLeapYear){
//            System.out.println(year + " is not a leap year");
//            return;
//        }
//        System.out.println(year + " is a leap year");

        // Optimised Solution
        if(checkYear(year)){
            System.out.println("It is a leap year");
        }else{
            System.out.println("It is not a leap year");
        }

    }
    static  boolean checkYear(int year){
        if(year % 4 == 0) {
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                }
                return true;
            }
        }
        return false;
    }
}
