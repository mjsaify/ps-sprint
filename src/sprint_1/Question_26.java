package sprint_1;

public class Question_26 {
    static void main(String[] args) {
        System.out.println("Write a program to check if a number is a narcissistic number.");
        System.out.println();

        int number = 153;
        int num = 0;
        int originalNumber = number;

        while (number != 0){
            int digit = number % 10;
            num = num + (digit * digit * digit);
            number /= 10;
        }
        if(originalNumber == num){
            System.out.println("It is a Narcissistic number");
        }else{
            System.out.println("No, It is not a Narcissistic number");
        }
    }
}
