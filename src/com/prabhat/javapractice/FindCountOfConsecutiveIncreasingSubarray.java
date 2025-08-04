package com.prabhat.javapractice;
import java.util.Arrays;
import java.util.Scanner;

public class FindCountOfConsecutiveIncreasingSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int length = sc.nextInt();
        int[] arr= new int[length];

        for (int i=0; i<arr.length; i++){
            System.out.print("Enter the "+(i+1)+"st element: ");
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        longestConsecutiveIncreasingSubarrayCount(arr);
    }
    public static void longestConsecutiveIncreasingSubarrayCount(int[] arr){
        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }
        int maxcount=1;
        int currcount=1;
        int currstartindex =0;
        int maxstartindex =0;

        for (int i = 1; i<arr.length;i++){
            if(arr[i]==arr[i-1]+1) {
                currcount++;

                if (currcount > maxcount) {
                    maxcount = currcount;
                    maxstartindex = currstartindex;
                }
            }else {
                currcount = 1;
                currstartindex =i;
            }
        }
        System.out.println("longest increasing subarray count is: "+maxcount);
        System.out.println("Longest consecutive increasing subarray: " + Arrays.toString(Arrays.copyOfRange(arr, maxstartindex, maxstartindex + maxcount)));
    }
}