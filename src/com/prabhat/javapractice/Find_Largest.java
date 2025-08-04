package com.prabhat.javapractice;

import java.util.Scanner;

public class Find_Largest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the total length of array:");
        int num = sc.nextInt();
        if(num<=1){
            System.out.println("Please enter the 2 number");
            return ;
        }

        int arr[] = new int [num];


        for(int i = 0 ; i < arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        int largest =arr[0];
        int index = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > largest) {
                largest = arr[j];
                index=j;
            }
        }

        //System.out.println(largest);
       // System.out.println(index);

      int swap=arr[0];
      arr[0]= arr[index];
      arr[index]=swap;

      int second_greatest=arr[1];
      int greatest_index=0;
        for (int j = 2; j < arr.length; j++) {
            if (arr[j] > second_greatest) {
                second_greatest = arr[j];
                greatest_index = j;
            }
        }
        System.out.println("second largest = "+second_greatest);


    }
}
