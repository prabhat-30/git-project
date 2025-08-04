package com.prabhat.javapractice;
import java.util.Scanner;
import java.util.Arrays;

public class CountSortedOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int length = sc.nextInt();
        int[] original = new int [length];
        for (int i = 0; i< original.length; i++){
            System.out.print("Enter the "+(i+1)+" st element: ");
            original[i]=sc.nextInt();
        }
        System.out.println("Array Before Sorting: "+Arrays.toString(original));
        int[] sortedArray=Arrays.copyOf(original, original.length);
        findSortedCount(original);
        System.out.println("Array After Sorting: "+Arrays.toString(original));
        int count = 0;
       for (int j = 0; j< original.length; j++){
           if(original[j]==sortedArray[j]){
               System.out.println("Sorted element at index: "+j+" Value----->> " +sortedArray[j]);
               count++;
           }
       }
        System.out.println("Number of elements already in sorted position: "+count);
    }
    public static void findSortedCount(int[] sortedArray){
        int passes=0;
        int swaps=0;
        for(int i = 0; i< sortedArray.length-1; i++){
            boolean swapped=false;
            passes++;
            for(int j = 0; j< sortedArray.length-i-1; j++){
                if(sortedArray[j]< sortedArray[j+1]){
                    int temp = sortedArray[j];
                    sortedArray[j]= sortedArray[j+1];
                    sortedArray[j+1]=temp;
                    swapped=true;
                    swaps++;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println("Number of passes required to sort the array: "+passes);
        System.out.println("Number of swaps required to sort the array: "+swaps);
    }
}
