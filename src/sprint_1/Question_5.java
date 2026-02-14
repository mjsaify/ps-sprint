package sprint_1;

public class Question_5 {
    static void main(String[] args) {
        System.out.println("Write a program to generate the Fibonacci series up to a given number.");
        System.out.println();

        // Couldn't attempt

        // Solution
        int N = 10;
        Fibonacci(N);
    }
    static void Fibonacci(int N){
        int n1 = 0, n2 = 1;

        for(int i = 0; i < N; i++){
            System.out.println(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
