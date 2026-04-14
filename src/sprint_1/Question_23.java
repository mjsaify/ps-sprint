package sprint_1;

import java.util.ArrayList;
import java.util.List;

public class Question_23 {
    static void main(String[] args) {
        System.out.println("Write a program to find the Fibonacci number at a specific position.");
        System.out.println();

        int position = 5;
        List<Integer> fibonacciNumbers = new ArrayList<Integer>();

        int a = 0;
        int b = 1;

        while (fibonacciNumbers.size() <= position){
            fibonacciNumbers.add(a);
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(fibonacciNumbers);
        int fn = fibonacciNumbers.get(position);
        System.out.println(fn);
    }
}