package sprint_1;

public class Question_28 {
    static void main(String[] args) {
        System.out.println("Write a program to find the sum of the digits of the factorial of a given number.");
        System.out.println();

        int number = 4;
        int factorial = 1;

        for (int i = number; i >= 1; i--) {
            factorial *= i;
        }
        int total = findSum(factorial);
        System.out.println("Factorial of " +  number + " is " + factorial);
        System.out.println("Sum of the Digits: " + total);
    }

    static int findSum(int n){
        int sum = 0;
        while(n != 0){
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return  sum;
    }
}
