package sprint_1;

public class Question_14 {
    static void main(String[] args) {
        System.out.println("Write a program to find the largest and smallest numbers in an array.");
        System.out.println();

        int[] numbers = {4, 7, 1, 8, 5};
        int largest = 0;
        int smallest = 0;
        int tempNum = numbers[0];

        for (int num:numbers) {
            if(num > largest){
                largest = num;
            }
            if(num < tempNum){
                smallest = num;
                tempNum = num;
            }
        }
        System.out.println("Smallest  Number: " + smallest);
        System.out.println("Largest Number: " + largest);
    }
}
