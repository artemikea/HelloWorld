package com.artem.lessons;

import java.util.Random;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rnd = new Random();

        //random numbers input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100);
        }

        System.out.println(Arrays.toString(arr));

        //bubblesort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                        int temp  = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
