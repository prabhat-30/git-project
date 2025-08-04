package com.prabhat.javapractice;
import java.util.Arrays;
import java.util.Scanner;

public class LocalPeakAndLocalValley {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int length= sc.nextInt();
        int[] arr= new int[length];

        if (arr.length<3){
            System.out.println("Array must have at least 3 elements to check for local peaks.");
            return;
        }
        for (int i =0 ; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        findLocalPeakAndLocalValleyCount(arr);
    }
    public static void findLocalPeakAndLocalValleyCount(int[] arr){
        int peakcount = 0;
        int valleycount =0;
        for (int i =1 ; i< arr.length-1; i++ ){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                peakcount++;
                System.out.println("Peak at index " + i + " → value: " + arr[i]);
            }
            else if (arr[i-1]>arr[i] && arr[i]<arr[i+1]) {
                valleycount++;
                System.out.println("Valley at index " + i + " → value: " + arr[i]);
            }

        }
        System.out.println("Total Number Of local peak: "+peakcount);
        System.out.println("Total Number Of local valley: "+valleycount);
    }

}
