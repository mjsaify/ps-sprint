package sprint_1;

public class Question_7 {
    static void main(String[] args) {
        System.out.println("Write a program to create different star patterns (e.g., pyramid, diamond).");
        System.out.println();
        int height = 5;

        for (int i = 1; i <= height; i++) { // print empty spaces
            for (int j = height - i; j >= 0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) { // print stars
                System.out.print("* ");
            }
            System.out.println(); // new empty line
        }
    }
}
