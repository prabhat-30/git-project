package com.prabhat.javapractice;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    static int swap;
    static int passes;

    public static void BubbleSortDescending(int[] arr){
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            boolean swapped=false;
            passes++;
            for(int j =0 ; j<n-i-1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                    swapped = true;
                }
            }
                if(!swapped) break;
        }
        System.out.println("Number of passes required to sort: "+passes);
        System.out.println("Number of swap required to sort: "+swap);
        System.out.println("Entered Array after sorting: "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of arr: ");
        int length = sc.nextInt();
        int []arr= new int [length];
        for (int i =0 ; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
            System.out.println("Entered Array before sorting: "+Arrays.toString(arr));

        BubbleSortDescending(arr);
    }
}
