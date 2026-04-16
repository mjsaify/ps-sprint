package sprint_1;

public class Question_27 {
    static void main(String[] args) {
        System.out.println("Write a program to generate number patterns (e.g., sequential numbers in a matrix).");
        System.out.println();

        int rows = 3;
        int number = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
