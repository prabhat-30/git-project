package com.prabhat.javapractice;

import java.util.Scanner;

public class ReverseNumber {
    public static void reverseNo(int num){
            int num1 = Math.abs(num);
            int count = 0;
            while (num != 0) {
                num = num / 10;
                count++;
            }
            System.out.println("Length of the number is: " + count);
            int temp = 0;

            for (int i = 0; i < count; i++) {
                int digit = num1 % 10;
                num1 = num1 / 10;
                temp = (temp * 10) + digit;
            }
            System.out.println(("Reversed Number = " + temp));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter -1 to exit the program or any other number to continue: ");
            int a=sc.nextInt();
            if(a==-1){
                System.out.println("Exiting the program-----------------------");
                break;
            }else{
             System.out.print("Please Enter the number: ");
             int num = sc.nextInt();
                reverseNo(num);
            }
        }
    }
}
