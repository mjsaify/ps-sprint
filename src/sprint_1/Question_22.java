package sprint_1;

import java.util.ArrayList;
import java.util.List;

public class Question_22 {
    static void main(String[] args) {
        System.out.println("Write a program to find the sum of all odd numbers within a given range.");
        System.out.println();

        int[] range = {1, 10};
        int total = 0;
        List<Integer> oddNumbers = new ArrayList<Integer>();

        for (int i = range[0]; i <= range[1]; i++) {
            boolean isEven = i % 2 == 0;
            if(!isEven){
                total += i;
                oddNumbers.add(i);
            }
        }
        System.out.println("Total Sum: " + total);
        System.out.println("Odd Numbers: " + oddNumbers);
    }
}