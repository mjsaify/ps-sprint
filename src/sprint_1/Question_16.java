package sprint_1;

public class Question_16 {
    static void main(String[] args) {
        System.out.println("Write a program to find the sum of elements in an array.");
        System.out.println();

        int[] arr = {1, 2, 3, 4, 5};
        int total = 0;

        for (int digits:arr) {
           total += digits;
        }
        System.out.println(total);
    }
}
