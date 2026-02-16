package sprint_1;

import java.util.Scanner;

public class Question_7 {
    static void main(String[] args) {
        System.out.println("Write a program to create different star patterns (e.g., pyramid, diamond).");
        System.out.println();


        // Solution
//        Scanner input = new Scanner(System.in);
//        String patternType = input.next();
//        int patternHeight = input.nextInt();

        String patternType = "pyramid";
        int patternHeight = 5;

        // My attempt (But it's printing right angle triangle)
//        for (int i = 0; i < patternHeight; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        // Solution
        for (int i = 0; i < patternHeight; i++) {
            for (int j = patternHeight - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
