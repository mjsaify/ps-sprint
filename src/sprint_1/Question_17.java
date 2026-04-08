package sprint_1;

import java.util.ArrayList;
import java.util.List;

public class Question_17 {
    static void main(String[] args) {
        System.out.println("Write a program to find all Armstrong numbers within a given range.");
        System.out.println();

        int[] range = {1, 500};
        List<Integer> output = new ArrayList<Integer>();
        findArmstrongInRange(range, output);
    }

    static void findArmstrongInRange(int[] arr, List<Integer> output) {
        for (int i = arr[0]; i < arr[1]; i++) {
            int num = i;
            int sum = 0;
            while (num > 0){
                int remainder = num % 10;
                sum += (remainder * remainder * remainder);
                num = num / 10;
            }
            if(sum == i){
                output.add(sum);
            }
        }
        System.out.println(output);
    }
}
