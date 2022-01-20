package com.bridgeLabz.ReveiwProblem;

public class SegregateEvenOdd {

    static void segregateEVenOdd(int arr[]){
        int left = 0, right = arr.length - 1;
        while(left<right){
            while(arr[left]%2 != 0 && left < right)
                left++;
            while(arr[right]%2 == 0 && left < right)
                right--;
            if (left < right){
                int temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 5, 9, 4};
        segregateEVenOdd(arr);
        System.out.println("Array after segregation : ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
