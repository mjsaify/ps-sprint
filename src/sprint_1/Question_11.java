package sprint_1;

public class Question_11 {
    static void main(String[] args) {
        System.out.println("Write a program to find the LCM of two numbers.");
        System.out.println();

        int a = 48;
        int b = 18;
        int lcm = 0;
        int hcf = findGCD(a, b);

        lcm = (a * b) / hcf;
        System.out.println(lcm);
    }

    static int findGCD(int a, int b){
        int temp = 0;
        while (b != 0){
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
