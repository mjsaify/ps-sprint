package sprint_1;

import java.util.ArrayList;
import java.util.List;

public class Question_19 {
    static void main(String[] args) {
        System.out.println("Write a program to find all prime numbers within a given range.");
        System.out.println();

        int[] range = {10, 30};
        List<Integer> output = new ArrayList<Integer>();

        findPrimeNumbers(range, output);
    }
    static void findPrimeNumbers(int[] range, List<Integer> output){
        int a = range[0];
        int b = range[1];

        for (int i = a; i <= b; i++) {
            if(isPrime(i)){
                output.add(i);
            }
        }
        System.out.println(output);
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return true;
        }
        for (int j = 2; j < n; j++) {
            if(n % j == 0){
                return false;
            }
        }
        return true;
    }
}
