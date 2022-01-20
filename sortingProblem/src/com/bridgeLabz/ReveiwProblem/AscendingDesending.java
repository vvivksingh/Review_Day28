package com.bridgeLabz.ReveiwProblem;
import java.util.*;

public class AscendingDesending {
    static void printOrder(int[] arr, int n) {

        int temp = 0;
        // sorting the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
                // printing first half in descending order
        for (int i = 0; i < n / 2; i++) {
            System.out.print(arr[i] + " ");
        }
        // printing second half in ascending order
        for (int j = n - 1; j >= n / 2; j--){
            System.out.print(arr[j]+" ");

        }


    }
    public static void main(String[] args){
        int[] arr = {1,3,2,5,9,4};
        int n = arr.length;
        printOrder(arr, n);

    }
}
