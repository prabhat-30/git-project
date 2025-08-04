package com.prabhat.javapractice;
import java.util.Scanner;

public class LargestOrMinimumNumber {

    public static void findLargest(int num1,int num2,int num3){

      if(num1>=num2) {
          if (num1 >= num3) {
              System.out.println("Largest Number=" + num1);
          } else {
              System.out.println("Largest Number=" + num3);
          }
      }
           else{
              if (num2 >= num3) {
                  System.out.println("Largest Number=" + num2);
              } else {
                  System.out.println("Largest Number=" + num3);
              }
          }

    }
    public static void findMinimum(int num1,int num2,int num3){

        if(num1<=num2) {
            if (num1 <= num3) {
                System.out.println("Minimum Number=" + num1);
            } else {
                System.out.println("Minimum Number=" + num3);
            }
        }
        else{
            if (num2 <= num3) {
                System.out.println("Minimum Number=" + num2);
            } else {
                System.out.println("Minimum Number=" + num3);
            }
        }

    }
    public static void ternaryLargest(int num1,int num2,int num3){
           int max=(num1>num2)?((num1>num3)?num1:num3):((num2>num3)?num2:num3);
        System.out.println("Ternary Largest= "+max);
        int y=Math.max( num1, Math.max(num2, num3));
        System.out.println("Max number= "+y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        while (true) {
            System.out.print("Please enter -1 to exit the program or any other number to continue: ");
            int num=sc.nextInt();
            if(num==-1){
                System.out.println("Exiting the Program-----------------------");
                break;
            }
            System.out.println("Please enter the numbers to check the largest number among them.");
            System.out.print("Please enter the 1'st Number= ");
            int num1 = sc.nextInt();
            System.out.print("Please enter the 2'nd Number= ");
            int num2 = sc.nextInt();
            System.out.print("Please enter the 3'rd Number= ");
            int num3 = sc.nextInt();
            findLargest(num1, num2, num3);
            findMinimum(num1,num2,num3);
            ternaryLargest(num1,num2,num3);
            System.out.println(" src/com/prabhat/javapractice/LargestOrMinimumNumber.java");

        }
    }
}
