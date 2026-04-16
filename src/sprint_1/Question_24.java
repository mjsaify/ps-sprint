package sprint_1;

import java.util.ArrayList;
import java.util.List;

public class Question_24 {
    static void main(String[] args) {
        System.out.println("Write a program to print all prime numbers less than a given number.");
        System.out.println();

        int number = 20;
        int count = 2;
        List<Integer> primeNumbers = new ArrayList<Integer>();

        for (int i = 2; i < number; i++) {
            if(isPrime(i)){
                primeNumbers.add(i);
            }
        }
        System.out.println(primeNumbers);
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }else{
            for (int j = 2; j < n; j++) {
                if(n % j == 0){
                    return false;
                }
            }
            return true;
        }
    }
}