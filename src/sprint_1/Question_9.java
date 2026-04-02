package sprint_1;

public class Question_9 {
    static void main(String[] args) {
        System.out.println("Write a program to calculate the sum of digits of a number.");
        System.out.println();

        int number = 1234; // Explanation: 1 + 2 + 3 + 4 = 10;
        int result = 0;

        while(number > 0){
            int digit = number % 10;
            number = number / 10;
            result += digit;
        }
        System.out.println(result);
    }
}
