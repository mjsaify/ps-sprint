package sprint_1;

public class Question_10 {
    static void main(String[] args) {
        System.out.println("Write a program to find the GCD of two numbers.");
        System.out.println();

        int a = 48;
        int b = 18;
        int temp = 0;


        while (b > 0){
            temp = a % b;
            a = b;
            b = temp;
        }
        System.out.println(a);
    }
}
