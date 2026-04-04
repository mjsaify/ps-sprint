package sprint_1;

import java.util.Scanner;

public class Question_12 {
    static void main(String[] args) {
        System.out.println("Write a program count Vowels and Consonants in a given string.");
        System.out.println();

        System.out.print("Type Sentence or a Word: ");
        Scanner input = new Scanner(System.in);
        if(!input.hasNext()){
            System.out.println("Please enter a valid string");
            return;
        }

        String text = input.nextLine().replaceAll("\\s", "").toLowerCase();
        String[] vowels = {"a", "e", "i", "o", "u"};
        int vowelsCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char words = text.toCharArray()[i];
            for (String v:vowels) {
                if(String.valueOf(words).equals(v)){
                    vowelsCount++;
                }
            }
            consonantCount = text.length() - vowelsCount;
        }
        System.out.println("Vowels: " + vowelsCount);
        System.out.println("Consonants: " + consonantCount);
    }
}
