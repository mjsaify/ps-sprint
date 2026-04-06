package sprint_1;

import java.util.Arrays;
import java.util.Collections;

public class Question_15 {
    static void main(String[] args) {
        System.out.println("Write a program to sort an array of numbers in ascending order.");
        System.out.println();

        int[] arr = {3, 1, 4, 1, 5, 9};
        int n = arr.length;
//        bubbleSort(arr, n);
        selectionSort(arr, n);
    }

    static void bubbleSort(int[] arr, int n){
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            int temp = arr[smallestIndex];
            arr[smallestIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
