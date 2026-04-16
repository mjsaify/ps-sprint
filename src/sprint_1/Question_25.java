package sprint_1;

public class Question_25 {
    static void main(String[] args) {
        System.out.println("Write a program to count the number of digits in a given number.");
        System.out.println();

        int number = 12345;
        int count = 0;

        while (number != 0){
            number = number / 10;
            count++;
        }
        System.out.println(count);
    }
}
