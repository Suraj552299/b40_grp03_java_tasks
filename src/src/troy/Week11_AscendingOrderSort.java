package src.troy;

import java.util.Arrays;

public class Week11_AscendingOrderSort {
    public static void sortAscending(int[] arr) {
        int n = arr.length;
        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {  // this line is for every round
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }
    public static void main(String[] args) {
        int[] numbers = {1, 5, 8, 3, 2, 11, -1};
        sortAscending(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
