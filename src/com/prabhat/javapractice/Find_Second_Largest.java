package com.prabhat.javapractice;

import java.util.Scanner;

public class Find_Second_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the number of array: ");
        int num= sc.nextInt();
        if(num<=1){
            System.out.println("please enter atleast 2 number");
            return;
        }
        int arr[] = new int [num];
        for(int i = 0 ; i < arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        int first_largest=arr[0];
        int second_largest=arr[1];
        //for (int i=0;i<arr.length;i++){
            if (arr[0]>arr[1]) {
                first_largest = arr[0];
                second_largest= arr[1];
            }else{
                first_largest = arr[1];
                second_largest = arr[0];
            }

           for(int j= 2; j<arr.length;j++){
               if (arr[j]>first_largest){
                   second_largest=first_largest;
                   first_largest=arr[j];
               }
               if(arr[j]>second_largest && arr[j]<=first_largest){
                   second_largest=arr[j];
               }
               //}
        }
        System.out.println("second largest : "+second_largest);

    }
}
